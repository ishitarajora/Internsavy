package com.internsavy.calculator;



import java.util.Scanner;

public class Calculator implements Operation {

	@Override
	public int sum(int x, int y) {
		return x + y;
	}

	@Override
	public int substraction(int x, int y) {
		return x - y;
	}

	@Override
	public int multiplication(int x, int y) {
		return x * y;
	}

	@Override
	public int division(int x, int y) {
		return x/y;
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		
		do{
			switch (choice) {
			case 1:
				System.out.println("Enter two two no.s for operation : ");
//				int a = sc.nextInt();
//				int b = sc.nextInt();
				
				System.out.println("The result is : " + cal.sum(sc.nextInt(), sc.nextInt()) );
				break;
			case 2 : {
				System.out.println("Enter two two no.s for operation : ");
//				int a = sc.nextInt();
//				int b = sc.nextInt();
				
				System.out.println("The result is : " + cal.substraction(sc.nextInt(), sc.nextInt()) );
				break;
			}
			case 3 : {
				System.out.println("Enter two two no.s for operation : ");
//				int a = sc.nextInt();
//				int b = sc.nextInt();
				
				System.out.println("The result is : " + cal.division(sc.nextInt(), sc.nextInt()) );
				break;
			}
			case 4 : {
				System.out.println("Enter two two no.s for operation : ");
//				int a = sc.nextInt();
//				int b = sc.nextInt();
				
				System.out.println("The result is : " + cal.multiplication(sc.nextInt(), sc.nextInt()) );
				break;
			}
			default:
				break;
			}
			
		}while(choice<0);
		sc.close();
	}

}

