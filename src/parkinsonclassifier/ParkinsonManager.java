/*
 * File Name: ParkinsonManager.java
 * Version: 1.0
 * Description: 
 * Authors: Milano Hyacinthe, Ashma Giri, Danny Lopes
 * UMUC
 * SWEN 670 
 */

package parkinsonclassifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import parkinsonData.DataLoader;
import parkinsonData.Parkinson;

public class ParkinsonManager {
    
	private static KNN knn = new KNN();
	private static DataLoader dataLoader = new DataLoader();
    private static Random generator = new Random();
    
    /**
     * [ParkinsonManager - class constructor]
     */
	public ParkinsonManager(){
	    
	}

	/**
	 * [Manager ]
	 * @param String testFile
	 * @param int k        
	 */
	public void Manager(String testFile, int k){        
	    
		String parkinsonFile =
			"./src/parkinsonData/parkinsons.data";
		        
		List<Parkinson> parkinsonList = dataLoader.LoadDataset(parkinsonFile);
		List<Parkinson> testSet = dataLoader.LoadDataset(testFile);

            
		List<Parkinson> parkinsonListPartition = new ArrayList<Parkinson>(parkinsonList);
            
		HashMap<Integer, List<Parkinson>> partitions = new HashMap<Integer, List<Parkinson>>();
	
		//Partiton dataset into 10 equally large partitions (selected randomly)
		int parkinsonCount = parkinsonListPartition.size();
		for(int i = 0; i < 10; i++) {
			List<Parkinson> partition = new ArrayList<Parkinson>();
			
			for(int j = 0; j < (parkinsonCount / 10); j++) {
				partition.add(GetRandomParkinsonFromList(parkinsonListPartition));
			}
			
			partitions.put(i, partition);
		}
	
		//TODO see below
		//Select 90 % and use as the model (test dataset) run the algorithm on the last partition
		//do that for each partition
		            
		for (Parkinson testParkinson : testSet){
			knn.calcKNearestNeighbors(k, testParkinson, parkinsonList);
		}
	}

	/**
	 * [GetRandomParkinsonFromList ]
	 * @param  Parkinson parkinsonList 
	 * @return Parkinson parkinson
	 */
	private static Parkinson GetRandomParkinsonFromList(List<Parkinson> parkinsonList) {
		int parkinsonSize = parkinsonList.size();
		int random = parkinsonSize > 1 ? generator.nextInt(parkinsonSize - 1) : 0;
		
		Parkinson parkinson = parkinsonList.get(random);
		parkinsonList.remove(random);
		
		return parkinson;
	}

}
