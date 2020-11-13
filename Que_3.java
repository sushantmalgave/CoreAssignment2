//3. Program to check whether number is prime or not.
//import java.util.Scanner;
import java.util.*;
class Que_3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no=sc.nextInt();
        sc.close();
        int i,sum=0;
        for(i=2;i<no;i++)
        {
            if(no%i==0)
            sum++;
        }
        if(sum>0)
               System.out.println(no+" is a Non-Prime number.");
        else
               System.out.println(no+" is a Prime number.");
    }
}





