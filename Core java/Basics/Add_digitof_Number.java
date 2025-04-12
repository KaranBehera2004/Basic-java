import java.util.Scanner;
public class Add_digitof_Number {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your numbers");
        int n=sc.nextInt();
        find(n);
    }
    public static void find(int n)
    {
        int sum=0,sum2=0,rem2,rem;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        while(sum>0)
        {
            if(sum>=10||sum>0)
            {
                rem2=sum%10;
                sum2=sum2+rem2;
                sum=sum/10;
            }
        }
        System.out.println(sum2);
    }

}
