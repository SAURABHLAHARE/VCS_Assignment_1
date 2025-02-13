//PROGRAM A: Read the three numbers from the user and display the greatest among these three.
//ROLL NO: 01 ,  NAME: LAHARE SAURABH

import java.util.Scanner;
public class One_1a{
    public static void main(String args[]){
        int num1,num2,num3;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter First Number:");
        num1=input.nextInt();
        System.out.print("Enter Second Number:");
        num2=input.nextInt();
        System.out.print("Enter Third Number:");
        num3=input.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1+" is the greatest number among all.");
        }
        else if(num2>num1 && num2>num3){
            System.out.println(num2+" is the greatest number among all.");
        }
        else if(num3>num1 && num3>num2){
            System.out.println(num3+" is the greatest number among all.");
        }
        else{
            System.out.println("All numbers are either equal or not distinct. Please enter different numbers.");
        }
    }
}
