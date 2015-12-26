package org.ycui.calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double result = 0.0d;
		try{			
			double num1 = Double.parseDouble(readDataFromConsole("Please input number 1: "));
			String oper = readDataFromConsole("Please select a operater: (+ - * /)");
			double num2 = Double.parseDouble(readDataFromConsole("Please input number 2: "));
			
			switch(oper){
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				if(num2!=0){
					result = num1 / num2;
				}else{
					System.out.println("num must not be 0!");
				}
				break;
			
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("wrong input!");
		}
	    System.out.println("The result is:  "+ result);

	}


private static String readDataFromConsole(String prompt) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = null;
    try {
        System.out.print(prompt);
        str = br.readLine();

    } catch (IOException e) {
        e.printStackTrace();
    }
    return str;
}
}