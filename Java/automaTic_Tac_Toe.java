import java.util.Scanner;

public class automaTic_Tac_Toe {

	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		int x, y, z=0, p;
		int t[]= new int[9];
		char o[]= new char[9];
		o[0]='1';o[1]='2';o[2]='3';o[3]='4';o[4]='5';o[5]='6';o[6]='7';o[7]='8';o[8]='9';

		while(1==1)
		{
			System.out.println();
			System.out.println();
			
			for(int l=0; l<=8; l++)
			{
			System.out.print(o[l]+"  ");
			if((l+1)%3==0)
				System.out.println();
			}
			
			while(1==1)
			{	
			p=a.nextInt();
			y=p-1;
			
			if (y<0||y>8)
				System.out.println("You may not do that");
			else if (t[y]!=0)
				System.out.println("You may not do that");
			else
			{
			t[y]=1;
			o[y]='X';
			break;
			}
			}
			
			for(int r=0; r<=8; r++)
				if(t[r-r%3+1]+t[r-r%3+2]+t[r-r%3]==3||t[r]+t[(r+3)%9]+t[(r+6)%9]==3||t[0]+t[4]+t[8]==3||t[2]+t[4]+t[6]==3)
				{
					System.out.println("Human win!");
					for(int l=0; l<=8; l++)
						{
						System.out.print(o[l]+"  ");
						if((l+1)%3==0)
							System.out.println();
						}
				System.exit(0);
				}

			for(int w=0; w<=8; w++)
			{
				if(t[w-w%3+1]+t[w-w%3+2]+t[w-w%3]==18||t[w]+t[(w+3)%9]+t[(w+6)%9]==18)
					{
						for(int c=0; c<=2; c++)
						{
							if(t[w-w%3+c]==0)
							{
								o[w-w%3+c]='O';
								c=2;
								w=8;
							}
						
							else if(t[(w+3*c)%9]==0)
							{
								o[(w+3*c)%9]='O';
								c=2;
								w=8;
							}
						
						}
						
						System.out.println("Bot win!");
						for(int l=0; l<=8; l++)
							{
							System.out.print(o[l]+"  ");
							if((l+1)%3==0)
								System.out.println();
							}
						System.exit(0);
					
					}
				
				else if(t[0]+t[4]+t[8]==18)
				{
					for(int c=0; c<=2; c++)
					if(t[4*c]==0)
					{
						o[4*c]='O';
						c=2;
						w=8;
					}
					
					System.out.println("Bot win!");
					for(int l=0; l<=8; l++)
						{
						System.out.print(o[l]+"  ");
						if((l+1)%3==0)
							System.out.println();
						}
					System.exit(0);
				}
				
				else if(t[2]+t[4]+t[6]==18)
				{
					for(int c=0; c<=2; c++)
						if(t[2*c+2]==0)
						{
							o[2*c+2]='O';
							c=2;
							w=8;
						}
					
					System.out.println("Bot win!");
					for(int l=0; l<=8; l++)
						{
						System.out.print(o[l]+"  ");
						if((l+1)%3==0)
							System.out.println();
						}
					System.exit(0);
				}
			}

			if(t[y-y%3]+t[y-y%3+1]+t[y-y%3+2]==2)
			{
				for (int c=0; c<=2; c++)
				if(t[y-y%3+c]==0)
				{
					t[y-y%3+c]=9;
					c=3;
				}
				
			}
			
			else if(t[y]+t[(y+3)%9]+t[(y+6)%9]==2)
			{
				for (int c=0; c<=6; c+=3)
				if(t[(y+c)%9]==0)
				{
					t[(y+c)%9]=9;
				    c=6;
				}
			}
			
			else if(t[0]+t[4]+t[8]==2)
			{
				for (int c=0; c<=8; c+=4)
					if(t[c]==0)
					{
						t[c]=9;
						c=8;
					}			
			}
			
			else if(t[2]+t[4]+t[6]==2)
			{
				for (int c=2; c<=6; c+=2)
					if(t[c]==0)
					{
						t[c]=9;
						c=6;
					}	
			}
			
			else
			{
				if(t[4]==0)
					t[4]=9;
				
				else if((t[0]+t[4]+t[8])%9==0)
				{
					for (int c=0; c<=8; c+=4)
						if(t[c]==0)
						{
							t[c]=9;
							c=8;
						}		
				}
				
				else if((t[2]+t[4]+t[6])%9==0)
				{
					for (int c=2; c<=6; c+=2)
						if(t[c]==0)
						{
							t[c]=9;
							c=6;
						}
				}
					
				
				else
					for(int w=0; w<=26; w++)
					{
						if(w<=8&&t[w]==0&&(t[w-w%3+1]+t[w-w%3+2]+t[w-w%3])%9==0&&(t[w]+t[(w+3)%9]+t[(w+6)%9])%9==0)
						{
							t[w]=9;
							w=26;
						}
						
						else if(w>=9&&w<=17&&t[w%9]==0)
						{
							if((t[w%9-w%9%3+1]+t[w%9-w%9%3+2]+t[w%9-w%9%3])%9==0||(t[w%9]+t[(w%9+3)%9]+t[(w%9+6)%9])%9==0)
							{
								t[w%9]=9;
								w=26;
							}
						}
						
						else if(w>=18&&t[w%9]==0)
						{
							t[w%9]=9;
							w=26;
						}		
					}		
			}
			
				for(int n=0; n<=8; n++)
				{
					if (t[n]==9)
						o[n]='O';
				}
				z++;
				if(z==5)
				{
					System.out.println("It's a tie.");
					System.exit(0);
				}
		}
	}
}