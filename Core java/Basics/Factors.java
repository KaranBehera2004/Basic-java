import java.util.Scanner;
public class Factors {
    public static void factor(int n)
    {
        int i=1;
        while(i<=n)
        {
            if(n%i==0)
            {
                System.out.print(i);
            }
            i++;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        factor(n);
    }
}
