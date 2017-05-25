import java.util.*;
class SAMESNAK

{
	public static void main (String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int i=0;i<test;i++)
		{
			int []a=new int[4];			
			int []b=new int[4];
			for(int j=0;j<4;j++)
			{
				a[j]=scan.nextInt();
			}
			for(int j=0;j<4;j++)
			{
				b[j]=scan.nextInt();
			}
			if((a[0]>b[0]&&a[2]<=b[2])||(a[0]<=b[0]&&a[2]>b[2])||(a[0]>b[2]&&a[2]<=b[0])||(a[0]<=b[2]&&a[2]>[0]))
			{
				if((a[0]==a[2]&&a[0]==b[0])||(a[0]==a[2]&&a[0]==b[2])||(b[0]==b[2]&&b[0]==a[0])||(b[0]==b[2]&&b[0]==a[2]))
				{
					System.out.println("yes");
				}
				else
				{
					System.out.println("no");
				}
			}
			else
				{
					System.out.println("no");
				}
		}
	}
}