//10. Write the program to find the sum of even elements and
//      sum of odd elements present in the array of integer type.
import java.util.Scanner;

class Que_10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]= new int[10];
        
        int i,odd=0,evn=0;
        for(i=0;i<10;i++)
        {
            System.out.print("Enter element "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
        sc.close();
        
        for(i=0;i<10;i++)
        {
            if(i==0 || i%2==0)
            {
                odd=odd+arr[i];
            }
            else
            {
                evn=evn+arr[i];
            }
        }
        System.out.print("Sum of Odd elements of Array is: "+odd+"\n");
        System.out.print("Sum of Even elements of Array is: "+evn+"\n");
    }
}


