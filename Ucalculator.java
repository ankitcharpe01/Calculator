import java.util.Scanner;

public class Ucalculator{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Welcome to Calculator.");
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                double result = addition(num1, num2);
                System.out.println("The addition of two nos is: " + result);

                sc.close();
        }

        public static double addition(double num1, double num2) {
                return num1 + num2;
        }
}