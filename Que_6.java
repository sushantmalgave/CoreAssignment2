//6. Program to show sum and average of 10 element array.
//    Accept array elements from user. 

import java.util.Scanner;

class Que_6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]= new int[10];
        
        int i,sum=0;
        float avg=0.0f;
        for(i=0;i<10;i++)
        {
           System.out.print("Enter element "+(i+1)+": ");
           arr[i]=sc.nextInt();
        }
        sc.close();
        
        for(i=0;i<10;i++)
        {
            sum=sum+arr[i];
        }
        avg=sum/10.0f;
        System.out.println("Sum of Array: "+sum);
        System.out.println("Average of Array: "+avg);
    }
}








