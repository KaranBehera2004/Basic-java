import java.util.Scanner;
public class Sortng_IncreasingOrder {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of eleemnts of an array");
        int n=sc.nextInt();
        System.out.println("Enter "+ n + "elemnts");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            for(int k=0;k<n-1;k++)
            {
                if(a[k]>a[k+1])
                {
                    int temp=a[k];
                    a[k]=a[k+1];
                    a[k+1]=temp;
                }
            }
        }
        for(int l=0;l<n;l++)
        {
            System.out.print(a[l] + " ");
        }
    }
}
