package org.ycui.calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{			
			double num1 = Double.parseDouble(readDataFromConsole("Please input number 1: "));
			String oper = readDataFromConsole("Please select a operater: (+ - * /)");
			double num2 = Double.parseDouble(readDataFromConsole("Please input number 2: "));
			System.out.println("The result is:  "+ Operation.getResult(num1, num2, oper));			
		}catch(Exception e){
			e.printStackTrace();
		}
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