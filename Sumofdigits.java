import java.util.Scanner;
class Sumofdigits
{
public static void main(String args[])
{
	int num,rem,quot,sum=0;
	System.out.println("enter a number");
	Scanner obj=new Scanner(System.in);
	num=obj.nextInt();
	while(num>=1)
	{
		rem=num%10;
		sum=sum+rem;
		num=num/10;
	}
     System.out.println("sum of digits is"+sum);
}
}