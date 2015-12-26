package org.ycui.calc;

public class OperationFactory {
	public static Operation createOperation(double num1, double num2, String oper){
		switch(oper){
		case "+":
			return new OperationAdd(num1, num2);// return instance "+"
		case "-":
			return new OperationDim(num1, num2);// return instance "-"
		case "*":
			return new OperationMul(num1, num2);// return instance "*"
		case "/":
			return new OperationDiv(num1, num2);// return instance "/"
		}
		return null;		
	}	
}
