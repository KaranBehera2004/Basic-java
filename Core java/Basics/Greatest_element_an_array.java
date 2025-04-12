import java.util.Scanner;
public class Greatest_element_an_array {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of eleemnst of an array");
        int n=sc.nextInt();
        System.out.println("Enter "+ n + "elements");
        int a[]=new int[n];
        int i;
        for( i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Max=" + max);
    }
}
