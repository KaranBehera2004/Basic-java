import java.util.Scanner;
public class Prime_no_print {
    public static void main(String[] args)
    {
        int cnt=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int j=1;
        for(int i=1;i<=n;i++)
        {
           if(i%j==0)
           {
                cnt=cnt+1;
           }
           j++;
           
        }
    }
}
