import java.util.*;
class pattern13	
{
     public static void main(String arg[])
    {
        try{
            int n,i,j,k;
            Scanner t=new Scanner(System.in);
            System.out.println("Enter n");
            n=t.nextInt();
            for(i=1;i<=n;i++)
             {
                   for(j=1;j<=n-i;j++)
                    {
                                System.out.print(" ");
                    }
	    for(k=0;k!=2*i-1;k++)
	      {
                          System.out.print("*");
	        }
                     System.out.println();
               }
       }
       catch(Exception e)
	{
	   System.out.println(e);
	 }
       }
}
