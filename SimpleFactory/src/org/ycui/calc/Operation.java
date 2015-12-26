package org.ycui.calc;

public class Operation {
	public static double getResult(double num1, double num2, String oper)
	{
		double result = 0.0d;
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
	return result;
	}
}
