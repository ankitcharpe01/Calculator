import java.util.Scanner;

public class Ucalculator{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Welcome to Calculator.");
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

		 System.out.println("Enter Choice");
		 System.out.println("1.Add");
		 System.out.println("2.Subtract");
		 int choice = sc.nextInt();
		
		
		switch(choice){
		case 1:
                double result = addition(num1, num2);
                System.out.println("The addition of two nos is: " + result);
		break;
                
		case 2:
                double result = subtract(num1,num2);
		System.out.println("The substraction of two nos is: " + result);
		break;

                sc.close();
        }

        public static double addition(double num1, double num2) {
                return num1 + num2;
        }
	
	public static double subtract(double num1, double num2) {
                return num1 - num2;
        }

}