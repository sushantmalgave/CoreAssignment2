//7. Sort a ten element array in descending order.
import java.util.Scanner;

class Assignment2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]= new int[10];
        
        int i,j,y;
        for(i=0;i<5;i++)
        {
                System.out.print("Enter element "+(i+1)+": ");
                arr[i]=sc.nextInt();
        }
        sc.close();
        
        System.out.println("Decending order of Array: ");
        for(i=0;i<5;i++)
        {
                y=0;
                for(j=0;j<5;j++)
                {
                        if(arr[i]>arr[j] && arr[i]<y)
                        {
                            arr[i]=arr[j];
                            y=arr[j];
                        }
                }
        }
        
        for(i=4;i>=0;i--)
        {
                System.out.print(arr[i]);
        }
        System.out.print("\n");
    }
}






