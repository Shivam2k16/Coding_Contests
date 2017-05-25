import java.util.*;
class TEMPLELA

{
	public static void main (String[] args) 
	{
		int g;
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int i=0;i<test;i++)
		{
			int l=scan.nextInt();
			
			boolean s=true;
			if(l%2==1)
			{
				for(int j=0;j<=(l/2);j++)
				{
					int a=scan.nextInt();
					if(a!=j+1)
						s=false;
				}
				int r=1;
				for(int j=(l/2+1);j<l;j++)
				{
					
					int a=scan.nextInt();
					if(a!=j-r)
						s=false;
					r+=2;
				}
				if(s==false)
					System.out.println("no");
				else
					System.out.println("yes");
					
			}
			else{
				for(int j=0;j<l;j++)
					g=scan.nextInt();
				System.out.println("no");
			}
			}
			}
			}