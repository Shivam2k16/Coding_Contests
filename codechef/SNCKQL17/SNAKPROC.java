import java.util.*;
class SNAKPROC

{
	public static void main (String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int i=0;i<test;i++)
		{
			int l=scan.nextInt();
			String sk = null;
    while (sk == null || sk.length() != l) 
	{
      sk = scan.next(); 
    }
			char []snake=sk.toCharArray();
			boolean s=true;
			for(int j=0;j<l;j++)
			{
				if(snake[j]=='.')
				{
					continue;
				}
				else if(snake[j]=='H'&&s==true)
				{
					s=false;
				}
				else if(snake[j]=='T'&&s==false)
				{
					s=true;
				}
				
				else
				{
					s=false;
					System.out.println("Invalid");
					break;
				}
			}
			if(s==true)
			System.out.println("Valid");
			else if((s==false)||(snake[l-1]=='H'&&s==true))
			System.out.println("Invalid");
			
			
		}
	}
}
