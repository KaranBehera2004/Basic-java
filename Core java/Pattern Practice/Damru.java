public class Damru {
    public static void main(String[] args)
    {
        int star=6,space=0;
        for(int i=1;i<=10;i++)
        {
            if(i<=5)
            {
                star--;
                space++;
            }
            else
            {
                star++;
                space--;
            }
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
