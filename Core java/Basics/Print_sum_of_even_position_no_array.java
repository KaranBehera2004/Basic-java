import java.util.Scanner;
public class Print_sum_of_even_position_no_array {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter no of elements of an array");
        int n=sc.nextInt();
        System.out.println("Enter "+ n + "elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(a[j]%2==0)
            {
                sum=sum+j;
            }
        }
        System.out.println("Sum of even number poistion is "+sum);

    }
}
