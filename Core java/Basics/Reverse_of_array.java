import java.util.Scanner;
public class Reverse_of_array {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente rno of elemenst of an array:");
        int n=sc.nextInt();
        System.out.println("Enter "+ n+"elemenst");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=n-1;j>=0;j--)
        {
            System.out.print(a[j] + " ");
        }
    }
   

}
