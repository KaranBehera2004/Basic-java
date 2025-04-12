public class Main_method_overloadcheck {
    public static void main(String[] args)
    {
        System.out.println("I am main(1st) main method ");
        main(4);
        main(1, 2);
        
    }
    public static void main(int i)
    {
        System.out.println("Hello I am 2nd main methos and result is "+i);
    }
    public static void main(int i,int j)
    {
        System.out.println("Hello I am 3rd main methos and result is "+i +j);   
    }
}
