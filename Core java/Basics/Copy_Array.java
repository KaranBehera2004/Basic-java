import java.util.Scanner;
public class Copy_Array {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements of an array");
        int n=sc.nextInt();
        System.out.println("Enter "+ n + "elements");
        int a[]=new int[n];
        int b[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            b[j]=a[j];
        }
        for(int k=0;k<n;k++)
        {
            System.out.print(b[k]);
        }
    }   
}
