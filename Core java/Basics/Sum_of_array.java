import java.util.Scanner;
public class Sum_of_array {
    public static void main(String[] args)
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of eleemnts of an array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+ "elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        int average=sum/n;
        System.out.println(average);
        System.out.println("Sum= "+sum);
    }
}
