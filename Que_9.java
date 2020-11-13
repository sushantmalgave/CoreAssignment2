//9. Write a program to search an element in the array.

import java.util.Scanner;

class Que_9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]= new int[10];
        
        System.out.print("Enter element to be searched: ");
        int el=sc.nextInt();
        
        int i,sum=0,pos=0;
        for(i=0;i<10;i++)
        {
           System.out.print("Enter element "+(i+1)+": ");
           arr[i]=sc.nextInt();
        }
        sc.close();
        
        for(i=0;i<10;i++)
        {
            if(el==arr[i])
            {
                sum++;
                pos=(i+1);
                break;
            }
        }
        if(sum>0)
        System.out.println(el+" is present in the Array at position "+pos);
        else
        System.out.println(el+" is not present in the Array.");
    }
}







