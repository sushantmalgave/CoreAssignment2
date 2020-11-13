import java.util.Scanner;

//1. Write a program to print table of any entered number using loop.

class Que_1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no=sc.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(no+" * "+i+" = "+no*i);
    }
}



