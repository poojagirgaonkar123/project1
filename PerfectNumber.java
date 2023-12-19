package pack3;

import java.util.Scanner;
public class PerfectNumber
    {
        public static void main(String args[])
        {
            long n, sum=0;
            Scanner sc=new Scanner(System.in);
            n= sc.nextLong();
            int i=1;
            while(i<=n/2)
            {
                if(n%i==0)
                {
                    sum= sum+i;
                }
                i++;
            }
            if(sum==n)
            {
                System.out.println(sum +" perfect number");
            }
            else
                System.out.println(sum +" not perfect number");
        }
    }

