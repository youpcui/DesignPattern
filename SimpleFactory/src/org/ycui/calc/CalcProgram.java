package org.ycui.calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String num1 = null;
		String num2 = null;
		String oper = null;
		boolean flag = false;
		do{			
			num1 = readDataFromConsole("Please input number 1: "); // input first number
			oper = readDataFromConsole("Please select a operater: (+ - * /)"); // input a operator
			num2 = readDataFromConsole("Please input number 2: "); // input second number
			
			if(verifyNum(num1) && verifyNum(num2) && verifyOper(oper)){
				Operation o = OperationFactory.
						createOperation(Double.parseDouble(num1), 
										Double.parseDouble(num2), 
										oper);	// transmit variables			
				System.out.println("The result is: " + o.getResult()); // print result
				flag=false;
			}else{
				System.out.println("Please check your input!");
				flag = true;
			}
		}while(flag);
		
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

private static boolean verifyNum(String str){
	if (!str.matches("^[0-9]+([.]{0,1}[0-9]+){0,1}$"))
        return false;
    return true;

}

private static boolean verifyOper(String str){
	if("+".equals(str) || "-".equals(str) || "*".equals(str) || "/".equals(str))
		return true;
	return false;
	
}
}