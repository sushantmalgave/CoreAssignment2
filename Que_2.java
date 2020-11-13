//2. Write a program to reverse a given number.
import java.util.Scanner;
class Que_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no=sc.nextInt();
        sc.close();
        
        int a,i,rev=0;
        for(i=1;no>0;i++)
        {
            a=no%10;
            rev=rev*10;
            rev=rev+a;
            no=no/10;
        }
        System.out.print("Reverse: "+rev);
    }
}






