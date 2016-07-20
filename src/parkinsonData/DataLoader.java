/*
 * File Name: DataLoader.java
 * Version: 1.0
 * Description: 
 * Authors: Milano Hyacinthe, Ashma Giri, Danny Lopes
 * UMUC
 * SWEN 670 
 */

package parkinsonData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DataLoader {
	
	/**
	 * [DataLoader - class constructor]
	 */
	public DataLoader () {}
	
	/**
	 * [LoadDataset ]
	 * @param  String filename 
	 * @return List<Parkinson> parkinsonList
	 */
	public List<Parkinson> LoadDataset(String filename){
		List<Parkinson> parkinsonList = new ArrayList<Parkinson>();
		String line = null;
		int col = 0;
		
		try {
			File file = new File(filename);
			BufferedReader bufReader = new BufferedReader(new FileReader(file));
			
			//read each line of text file
			while((line = bufReader.readLine()) != null)
			{
				//Tokenize each "word"
				StringTokenizer st = new StringTokenizer(line,",");
				Parkinson parkinson = new Parkinson();
				col = 0; //reset the column no
				
				for(; col < 24; col++){
					if(st.hasMoreTokens()) {
						String field = st.nextToken();
						
						switch (col) {
						case 0:
							parkinson.setName(field);
							break;
						case 1:
							parkinson.setC2(TryParseDouble(field));
							break;
						case 2:
							parkinson.setC3(TryParseDouble(field));
							break;
						case 3:
							parkinson.setC4(TryParseDouble(field));
							break;
						case 4:
							parkinson.setC5(TryParseDouble(field));
						break;
   						case 5:
							parkinson.setC6(TryParseDouble(field));
						break;
    					case 6:
							parkinson.setC7(TryParseDouble(field));
						break;
        				case 7:
							parkinson.setC8(TryParseDouble(field));
						break;
            			case 8:
							parkinson.setC9(TryParseDouble(field));
						break;
                		case 9:
							parkinson.setC10(TryParseDouble(field));
						break;
                    	case 10:
							parkinson.setC11(TryParseDouble(field));
						break;
                        case 11:
							parkinson.setC12(TryParseDouble(field));
						break;
                        case 12:
							parkinson.setC13(TryParseDouble(field));
						break;
                        case 13:
							parkinson.setC14(TryParseDouble(field));
						break;
                        case 14:
							parkinson.setC15(TryParseDouble(field));
						break;
                        case 15:
							parkinson.setC16(TryParseDouble(field));
						break;
                        case 16:
							parkinson.setC17(TryParseDouble(field));
						break;
                        case 17:
                            parkinson.setStatus(Integer.parseInt(field));
						break;
      					case 18:
							parkinson.setC19(TryParseDouble(field));
						break;
          				case 19:
							parkinson.setC20(TryParseDouble(field));
						break;
              			case 20:
							parkinson.setC21(TryParseDouble(field));
						break;
                  		case 21:
							parkinson.setC22(TryParseDouble(field));
						break;
                  		case 22:
							parkinson.setC23(TryParseDouble(field));
						break;
                      	case 23:
							parkinson.setC24(TryParseDouble(field));
						break;
						default: //Do nothing
							break;
						}
					}
					else
						System.out.println("No more tokens");
				}
				col = 0;
				parkinsonList.add(parkinson);
			}
				
			//close the file
			bufReader.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return parkinsonList;
	}
	
	/**
	 * [TryParseDouble ]
	 * @param  String stringVal [description]
	 * @return double result
	 */
	private double TryParseDouble(String stringVal)
	{
		double result = -1;
		
		try {
			if(stringVal != null) {
				result = Double.parseDouble(stringVal);
				return result;
			}
		}
		catch (NumberFormatException e) {
			//Do nothing
		}
		
		return result;
	}
}
