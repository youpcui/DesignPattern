package org.ycui.calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double num1 = 0.0d;
		double num2 = 0.0d;
		String oper = null;
		try{			
			num1 = Double.parseDouble(readDataFromConsole("Please input number 1: ")); // input first number
			oper = readDataFromConsole("Please select a operater: (+ - * /)"); // input a operator
			num2 = Double.parseDouble(readDataFromConsole("Please input number 2: ")); // input second number
		}catch(Exception e){
			e.printStackTrace();
		}
		Operation o = OperationFactory.createOperation(num1, num2, oper);	// transmit variables			
		System.out.println("The result is: " + o.getResult()); // print result
	}

/**
 * Read input stream from console
 * */
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