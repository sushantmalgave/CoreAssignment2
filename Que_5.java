//5. Print all prime numbers between two given numbers. [break, continue]
import java.util.Scanner;
class Que_5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Upper Bound: ");
        int lb=sc.nextInt();
        System.out.print("Enter Lower Bound: ");
        int ub=sc.nextInt();
        sc.close();
        
        int i,j,sum;
        System.out.print("Prime No. between "+lb+" and "+ub+" are :");

        for(i=lb+1;i<ub;i++)
        {
            sum=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    sum++;
                    break;
                }
                else
                    continue;
            }
            if(sum==0)
            System.out.print(" "+i+",");
        }
    }
}









