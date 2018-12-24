import java.util.*;
public class large 
{
      public static void main(String aa[])
      {
            int n;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();

            }
             Arrays.sort(a);
             for(int i=n;i>=0;i--)
             {
             System.out.printf("%d\t",a[i]
             }
        }
  }
