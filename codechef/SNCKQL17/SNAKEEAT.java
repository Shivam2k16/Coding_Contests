import java.util.*;
class SNAKEEAT

{
	public static void main (String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int i=0;i<test;i++)
		{
			int n=scan.nextInt();
			int []a=new int[n];			
			int q=scan.nextInt();
			for(int j=0;j<n;j++)
			{
				a[j]=scan.nextInt();
			}
			Arrays.sort(a);
			for(int j=0;j<q;j++)
			{
				int aq=scan.nextInt();
				for(int r=0;r<n;r++)
				{
					if(a[r]>=aq){
					if(r>1&&a[r-1]+1>=aq){
						System.out.println(n-r+1);
					break;
					}
					else if((r>1)&&(a[r-1]+1<aq)){
						System.out.println(n-r);
					break;
					}
					else if((r==0)||(r==1)){
						System.out.println(n-r);
					break;
					}
					else
						continue;
					}
					else if(r==n-1&&a[r]+1<aq)
					{
					System.out.println(0);
					break;
					}
					else
						continue;
				
				}
				
			}
		}
	}
}