/*
 * File Name: Program.java
 * Version: 1.0
 * Description: Main file of the KNN Program. The program expects a user to provide
 * 				a file path containing a dataset as well as the k-value to which 
 * 				the algorithm will determine the K-Nearest Neighbor.
 * Authors: Milano Hyacinthe, Ashma Giri, Danny Lopes
 * UMUC
 * SWEN 670 
 */


package parkinsonclassifier;
import java.util.*;

/**
 * Main class constructor.
 */
public class Program {

    public static void main(String[] args) {

		ParkinsonManager userInput = new ParkinsonManager();
		String testFile = "";
		int k = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter test file path:");
		testFile = scan.nextLine();
		System.out.println("Enter k-value: "); 
	    k = scan.nextInt();
	    userInput.Manager(testFile, k);
System.out.println("The result output file is saved in ./data/result.csv");
    }
}
