public class First {

    static int i=100;
    int j=200;
    public static void main(String[] args)
    {
        First f1=new First();
        f1.i=300;
        f1.j=490;
        First f2=new First();
        System.out.println(i);
        System.out.println(f1.i);
        System.out.println(f1.j);
        System.out.println(i);
        System.out.println(f2.j);
    }
}