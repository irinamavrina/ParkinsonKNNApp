/*
 * File Name: Parkinson.java
 * Version: 1.0
 * Description: 
 * Authors: Milano Hyacinthe, Ashma Giri, Danny Lopes
 * UMUC
 * SWEN 670 
 */

package parkinsonData;


import java.awt.geom.Point2D;
import java.util.List;

public class Parkinson {
	
    private double c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24;
	private String name;
	private int status;

	/** [Parkinson - default constructor] */
	public Parkinson(){	}
	
	/**
	 * [Parkinson - overridden constructor that passes along name and status]
	 * @param  String name
	 * @param  int status
	 */
    public Parkinson(String name, int status){
        this.name = name;
        this.status = status;
    }
    
    /**
     * [Parkinson - overriden constructor that passes the value of each column cell]
     * @param  String name   [description]
     * @param  double c2     
     * @param  double c3     
     * @param  double c4     
     * @param  double c5     
     * @param  double c6     
     * @param  double c7     
     * @param  double c8     
     * @param  double c9     
     * @param  double c10    
     * @param  double c11    
     * @param  double c12    
     * @param  double c13    
     * @param  double c14    
     * @param  double c15    
     * @param  double c16    
     * @param  double c17    
     * @param  int status
     * @param  double c19    
     * @param  double c20    
     * @param  double c21    
     * @param  double c22    
     * @param  double c23    
     * @param  double c24    
     */
	public Parkinson(String name, double c2, double c3, double c4, double c5, double c6, double c7, double c8, double c9, double c10, double c11, double c12, double c13, double c14, double c15, double c16, double c17, int status, double c19, double c20, double c21, double c22, double c23, double c24) {
		this.name = name;
                this.c2 = c2;
                this.c3 = c3;
                this.c4 = c4;
                this.c5 = c5;
                this.c6 = c6;
                this.c7 = c7;
                this.c8 = c8;
                this.c9 = c9;
                this.c10 = c10;
                this.c11 = c11;
                this.c12 = c12;
                this.c13 = c13;
                this.c14 = c14;
                this.c15 = c15;
                this.c16 = c16;
                this.c17 = c17;
                this.status = status;
                this.c19 = c19;
                this.c20 = c20;
                this.c21 = c21;
                this.c22 = c22;
                this.c23 = c23;
                this.c24 = c24;
                
	}
	
	/**
	 * [getC2 - get value of c2]
	 * @return double c2
	 */
	public double getC2() {
		return c2;
	}

	/**
	 * [setC2 - set value of c2]
	 * @param double c2 
	 */
	public void setC2(double c2) {
		this.c2 = c2;
	}
	
	/**
	 * [getC3 - get value of c3]
	 * @return double c3
	 */
	public double getC3() {
		return c3;
	}

	/**
	 * [setC3 - set value of c3]
	 * @param double c3 
	 */
	public void setC3(double c3) {
		this.c3 = c3;
	}
	
	/**
	 * [getC4 - get value of c4]
	 * @return double c4
	 */
	public double getC4() {
		return c4;
	}

	/**
	 * [setC4 - set value of c4]
	 * @param double c24
	 */
	public void setC4(double c4) {
		this.c4 = c4;
	}
	
	/**
	 * [getC5 - get value of c5]
	 * @return double c5
	 */
	public double getC5() {
		return c5;
	}

	/**
	 * [setC5 - set value of c5]
	 * @param double c5
	 */
	public void setC5(double c5) {
		this.c5 = c5;
	}
	
	/**
	 * [getC6 - get value of c6]
	 * @return double c6
	 */
	public double getC6() {
		return c6;
	}

	/**
	 * [setC6 - set value of c6]
	 * @param double c6
	 */
	public void setC6(double c6) {
		this.c6 = c6;
	}
	
	/**
	 * [getC7 - get value of c7]
	 * @return double c7
	 */
	public double getC7() {
		return c7;
	}

	/**
	 * [setC7 - set value of c7]
	 * @param double c7
	 */
	public void setC7(double c7) {
		this.c7 = c7;	
	}
		
	/**
	 * [getC8 - get value of c8]
	 * @return double c8
	 */
	public double getC8() {
		return c8;
	}

	/**
	 * [setC8 - set value of c8]
	 * @param double c8
	 */
	public void setC8(double c8) {
		this.c8 = c8;
	}
	
	/**
	 * [getC9 - get value of c9]
	 * @return double c9
	 */
	public double getC9() {
		return c9;
	}

	/**
	 * [setC9 - set value of c9]
	 * @param double c9
	 */
	public void setC9(double c9) {
		this.c9 = c9;
	}
	
	/**
	 * [getC10 - get value of c10]
	 * @return double c10
	 */
	public double getC10() {
		return c10;
	}

	/**
	 * [setC10 - set value of c10]
	 * @param double c10 
	 */
	public void setC10(double c10) {
		this.c10 = c10;
	}
	
	/**
	 * [getC11 - get value of c11]
	 * @return double c11
	 */
	public double getC11() {
		return c11;
	}

	/**
	 * [setC11 - set value of c11]
	 * @param double c11
	 */
	public void setC11(double c11) {
		this.c11 = c11;
	}
	
	/**
	 * [getC12 - get value of c12]
	 * @return double c12
	 */
	public double getC12() {
		return c12;
	}

	/**
	 * [setC12 - set value of c12]
	 * @param double c12 
	 */
	public void setC12(double c12) {
		this.c12 = c12;
	}
	
	/**
	 * [getC13 - get value of c13]
	 * @return double c13
	 */
	public double getC13() {
		return c13;
	}

	/**
	 * [setC13 - set value of c13]
	 * @param double c13
	 */
	public void setC13(double c13) {
		this.c13 = c13;
	}
	
	/**
	 * [getC14 - get value of c14]
	 * @return double c14
	 */
	public double getC14() {
		return c14;
	}

	/**
	 * [setC14 - set value of c14]
	 * @param double c14
	 */
	public void setC14(double c14) {
		this.c14 = c14;
	}
	
	/**
	 * [getC15 - get value of c15]
	 * @return double c15
	 */
	public double getC15() {
		return c15;
	}

	/**
	 * [setC15 - set value of c15]
	 * @param double c15
	 */
	public void setC15(double c15) {
		this.c15 = c15;
	}
	
	/**
	 * [getC16 - get value of c16]
	 * @return double c16
	 */
	public double getC16() {
		return c16;
	}

	/**
	 * [setC16 - set value of c16]
	 * @param double c16
	 */
	public void setC16(double c16) {
		this.c16 = c16;
	}
	
	/**
	 * [getC17 - get value of c17]
	 * @return double c17
	 */
	public double getC17() {
		return c17;
	}

	/**
	 * [setC17 - set value of c17]
	 * @param double c17
	 */
	public void setC17(double c17) {
		this.c17 = c17;
	}
	
	/**
	 * [getC19 - get value of c19]
	 * @return double c19
	 */
	public double getC19() {
		return c19;
	}

	/**
	 * [setC19 - set value of c19]
	 * @param double c19 
	 */
	public void setC19(double c19) {
		this.c19 = c19;
	}
	
	/**
	 * [getC20 - get value of c20]
	 * @return double c20
	 */
	public double getC20() {
		return c20;
	}

	/**
	 * [setC20 - set value of c20]
	 * @param double c20 
	 */
	public void setC20(double c20) {
		this.c20 = c20;
	}
	
	/**
	 * [getC21 - get value of c21]
	 * @return double c21
	 */
	public double getC21() {
		return c21;
	}

	/**
	 * [setC21 - set value of c21]
	 * @param double c21
	 */
	public void setC21(double c21) {
		this.c21 = c21;
	}
	
	/**
	 * [getC22 - get value of c22]
	 * @return double c22
	 */
	public double getC22() {
		return c22;
	}

	/**
	 * [setC22 - set value of c22]
	 * @param double c22 
	 */
	public void setC22(double c22) {
		this.c22 = c22;
	}

    /**
	 * [getC23 - get value of c23]
	 * @return double c23
	 */
	public double getC23() {
		return c23;
	}

	/**
	 * [setC23 - set value of c23]
	 * @param double c23
	 */
	public void setC23(double c23) {
		this.c23 = c23;
	}
	
	/**
	 * [getC24 - get value of c24]
	 * @return double c24
	 */
    public double getC24() {
		return c24;
	}

	/**
	 * [setC24 - set value of c24]
	 * @param double c24
	 */
	public void setC24(double c24) {
		this.c24 = c24;
	}

	/**
	 * [getName - retrieves the value of name]
	 * @return String name
	 */
	public String getName() {
		return name;
	}

	/**
	 * [setName - set value of name]
	 * @param String name 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * [getStatus - retrieves the value of status]
	 * @return int status
	 */
    public int getStatus() {
		return status;
	}

	/**
	 * [setStatus - set value of status]
	 * @param int status 
	 */
	public void setStatus(int status) {
		this.status = status;
	}

    /**
     * [toString]
     * @return String
     */
    public String toString() {
		return this.name + "," + this.status;
	}
	
	/**
	 * [getSamplePoint - Generates a point from parkinson column 2 and columb 3 values.]
	 * @return Point2D.Double point
	 */
	public Point2D.Double getSamplePoint() {
		Point2D.Double point = new Point2D.Double();
		point.x = this.c2;
		point.y = this.c3;
                
		return point;
	}
	
}
