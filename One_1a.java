//PROGRAM A: Read the three numbers from the user and display the greatest among these three.
//ROLL NO: 01 ,  NAME: LAHARE SAURABH
//LOGIC  : if one number is greater than remaining two numbers then that number is the greatest number among all these three numbers.

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

//OUTPUT:
/*Enter First Number:22
 Enter Second Number:1
 Enter Third Number:8
 22 is the greatest number among all.

  Enter First Number:55
 Enter Second Number:20
 Enter Third Number:45
 55 is the greatest number among all.


  Enter First Number:8
  Enter Second Number:8
  Enter Third Number:8
  All numbers are either equal or not distinct. Please enter different numbers.
*/