/*
 * File Name: DataStorage.java
 * Version: 1.0
 * Description: 
 * Authors: Milano Hyacinthe, Ashma Giri, Danny Lopes
 * UMUC
 * SWEN 670 
 */

package parkinsonData;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DataStorage {

    /**
     * [DataStorage - class constructor]
     */
    public DataStorage(){
    
    }
    
    /**
     * [StoreResult - store result in resultData.csv]
     * @param String line 
     */
    public static void StoreResult(String line){
       PrintWriter output = null; 
       String fileName = "D:/res/q.txt";
        try{
            output = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
            
            output.println(line);
        } catch (Exception e){
        
        System.err.println("File not found Error: " + e);
        }
        finally {
            if(output != null)
                output.close();
        } 
    }


}
