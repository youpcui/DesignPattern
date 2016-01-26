package ycui.dp.calc;

public abstract class Operation {
	private double num1 = 0.0d;
	private double num2 = 0.0d;
		
	public Operation(double num1, double num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	public abstract double getResult();


	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
}

class OperationAdd extends Operation{
	double result = 0.0d;
	public OperationAdd(double num1, double num2){
		super(num1, num2);		
	}
	public double getResult(){
		result = super.getNum1() + super.getNum2();
		return result;	
	}
}

class OperationSub extends Operation{
	double result = 0.0d;
	public OperationSub(double num1, double num2){
		super(num1, num2);		
	}
	public double getResult(){
		result = super.getNum1() - super.getNum2();
		return result;	
	}
}

class OperationMul extends Operation{
	double result = 0.0d;
	public OperationMul(double num1, double num2){
		super(num1, num2);		
	}
	public double getResult(){
		result = super.getNum1() * super.getNum2();
		return result;	
	}
}

class OperationDiv extends Operation{
	double result = 0.0d;
	public OperationDiv(double num1, double num2){
		super(num1, num2);		
	}
	public double getResult(){
		if(super.getNum2() != 0){
			result = super.getNum1() / super.getNum2();
		}else{
			System.out.println("Number2 must not be 0!");
		}
		return result;	
	}
}
