//4. Calculate  series : 1^2+2^2+3^2+4^2+.........+n^2.


import java.util.Scanner;
class Que_4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n (for 1^2+2^2+3^2+...+n^2): ");
        int n=sc.nextInt();
        sc.close();
        
        int i,sum=0;
        for(i=1;i<=n;i++)
        {
            sum=sum+i*i;
        }
        System.out.println("1^2+2^2+3^2+...+"+n+"^2= "+sum);
    }
}









//5. Print all prime numbers between two given numbers. [break, continue]

class Assignment2
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






