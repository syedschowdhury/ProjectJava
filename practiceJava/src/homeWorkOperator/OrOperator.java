package homeWorkOperator;

import java.util.Scanner;

public class OrOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;
        System.out.print("Please enter your first number: ");
        num1 = input.nextInt();
        System.out.print("Please enter your second number: ");
        num2 = input.nextInt();

        if(num1>num2 && (num1+num2)%2==0){
            System.out.println(num1+" is bigger than "+num2+" Or the total is even");
        }else if(num1<num2 && (num1+num2)%2!=0){
            System.out.println(num2+" is bigger than "+num1+" Or the total is even");
        }else if(num1==num2 || (num1+num2)%2==0){
            System.out.println(num2+" & "+num1+" are same Or the total is even");
        }else {
            System.out.println("Something Else");
        }


    }
}
