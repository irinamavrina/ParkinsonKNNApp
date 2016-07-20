/*
 * File Name: ParkinsonDistance.java
 * Version: 1.0
 * Description: 
 * Authors: Milano Hyacinthe, Ashma Giri, Danny Lopes
 * UMUC
 * SWEN 670 
 */

package parkinsonclassifier;

import parkinsonData.Parkinson;

public class ParkinsonDistance  implements Comparable {
	private  Parkinson parkinson;
	private double distance;

	/**
	 * [getParkinson - get object Parkinson]
	 * @return Parkinson parkinson
	 */
	public Parkinson getParkinson() {
		return parkinson;
	}

	/**
	 * [setParkinson - set object Parkinson]
	 * @param Parkinson parkinson 
	 */
	public void setParkinson(Parkinson parkinson) {
		this.parkinson = parkinson;
	}

	/**
	 * [getDistance - get distance]
	 * @return double distance
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * [setDistance - set distance]
	 * @param double distance
	 */
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	/**
	 * [ParkinsonDistance - class constructor]
	 * @param  Parkinson parkinson 
	 * @param  double distance  
	 */
	public ParkinsonDistance(Parkinson parkinson, double distance) {
		this.parkinson = parkinson;
		this.distance = distance;
	}

	
	/**
	 * [compareTo - override of compareTo function]
	 * @param  Object o - the Object to be compared.
	 * @return   A negative integer, zero, or a positive integer as this object is less than,
	 *		equal to, or greater than the specified object.
	 */
	@Override
	public int compareTo(Object o) {
		if(this.distance < ((ParkinsonDistance)o).distance)
			return -1;
		else if(this.distance == ((ParkinsonDistance)o).distance)
			return 0;
		return 1;
	}
}
