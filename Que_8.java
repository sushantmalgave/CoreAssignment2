//8. Write a program to reverse the array elements.
import java.util.Scanner;

class Que_8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]= new int[10];
        
        int i;
        for(i=0;i<10;i++)
        {
           System.out.print("Enter element "+(i+1)+": ");
           arr[i]=sc.nextInt();
        }
        sc.close();
        
        System.out.print("Reverse of Array: ");
        for(i=9;i>=0;i--)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.print("\n");
    }
}

