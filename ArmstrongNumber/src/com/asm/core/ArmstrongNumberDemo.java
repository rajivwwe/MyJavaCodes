package com.asm.core;

/*Armstrong Number in Java: Armstrong number is a number that is equal to the sum of cubes of
its digits for example 0, 1, 153, 370, 371, 407 etc.
*/
public class ArmstrongNumberDemo {

	public static void main(String[] args) {

        int n, b, sum = 0;
        System.out.print("Armstrong numbers from 1 to 1000:");

        for(int i = 1; i <= 1000; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
	}	
	
}

/*To check entered number is Armstrong Number or Not.*/

public class Armstrong
		{
		    public static void main(String[] args) 
		     {
				
		int c=0,a,temp;
		int n=153;
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c)
		{
			System.out.println("Armstrong number");
		}else
		{
			System.out.println("Not a Armstrong number");
		}

	}

}
