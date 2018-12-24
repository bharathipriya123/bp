import java.util.*;
public class index
{
      public static void main(String aa[])
      {
            int n;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();

            }
            for(int i=0;i<=n;i++)
            {
            if(a[i]==i)
            {
            b[i]=a[i];
            }
            else
            Sytem.out.print(-1);
            }
            Arrays.sort(b[i]);
            System.out.printf("%d\t",b[i]);
            }
            }
            
