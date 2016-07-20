/*
 * File Name: KNN.java
 * Version: 1.0
 * Description: 
 * Authors: Milano Hyacinthe, Ashma Giri, Danny Lopes
 * UMUC
 * SWEN 670 
 */
package parkinsonclassifier;

import parkinsonData.Parkinson;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import parkinsonData.DataStorage;


public class KNN {
	
	/**
	 * [calcKNearestNeighbors - calculate the K Nearest Neighbor algorithm]
	 * @param  int k         The number of neighbors we want to find in our algorithm
	 * @param  Parkinson testParkinson 
	 * @param  List<Parkinson> dataset       
	 * @return String mostFrequentLabel
	 */
	public String calcKNearestNeighbors(int k, Parkinson testParkinson, List<Parkinson> dataset) {
		List<Parkinson> kNearestNeighbors = new ArrayList<Parkinson>();
		
		List<ParkinsonDistance> parkinsonDistList = new ArrayList<ParkinsonDistance>();
		
                        
		for(Parkinson dataParkinson : dataset) {
			double distance = calculateDistance(testParkinson.getSamplePoint(), dataParkinson.getSamplePoint());
			parkinsonDistList.add(new ParkinsonDistance(dataParkinson, distance));
		}
		
		Collections.sort(parkinsonDistList);
		
		for(int i = 0; i < k; i++)
			kNearestNeighbors.add(parkinsonDistList.get(i).getParkinson());
		
                String mostFrequentLabel = GetMostFrequentLabel(kNearestNeighbors);
                String possiblePD  = "";
                if( mostFrequentLabel.equals("1") ){
                    possiblePD = "Possible PD Yes";
                }else if (mostFrequentLabel.equals("0") ){
                    possiblePD = "Possible PD no";
                }
                                DataStorage.StoreResult("Test Parkinson Name" + "," + testParkinson.toString() + "," + possiblePD);
               
                return mostFrequentLabel;
	}
	
	/**
	 * [GetMostFrequentLabel - searches through List<Parkinson> for the label that is most common and returns it]
	 * @param  List<Parkinson> knn 
	 * @return String key - returns key if the value is equal to the last value in the Collections item,
	 *                		if not then it will return an empty string
	 * @return String [empty string]
	 */
        private String GetMostFrequentLabel(List<Parkinson> knn) {
		HashMap<String, Integer> labels = new HashMap<String, Integer>();
String name = "";		
		for(Parkinson parkinson : knn) {
			//String name = parkinson.getName();
                        name = Integer.toString(parkinson.getStatus());
			if(labels.containsKey(name)) {
				int value = labels.get(name);
				labels.put(name, value + 1);
			} else {
				labels.put(name, 1);
			}
		}
		
		int maxVal = Collections.max(labels.values());
		
		Iterator iterator = labels.keySet().iterator();
		
		while(iterator.hasNext()) {
			String key = (String)iterator.next();
			int value = labels.get(key);
			
			if(value == maxVal)
				return key;
		}
		return "";
	}

	/**
	 * [calculateDistance - calculates the distance between 2 points within the dataset, the distance is then returned]
	 * @param  Point2D.double point1 
	 * @param  Point2D.Double 
	 * @return double distance
	 */
	private double calculateDistance(Point2D.Double point1, Point2D.Double point2) {
		double distance = 
			Point2D.Double.distance(point1.x, point1.y, point2.x, point2.y);
		
		return distance;
	}
        
}
