package calculator_2;

import java.util.Scanner;

import calculator_2.operations.Operation;

public class Calculator_2 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Insert first time: ");
		Double a = s.nextDouble();
		s.nextLine();
		System.out.print("Insert the operator: ");
		String op = s.nextLine();
		System.out.print("Insert the second number: ");
		Double b = s.nextDouble();
		
		Operation o = Operation.parseOperator(op);
		if(o == null) {
			System.err.println("Operator non recognized!");
		}else {
			o.setNumbers(a, b);
			System.out.println("Results of " + o.getName() + " is " + o.calc());
		}
		s.close();
	}
}


