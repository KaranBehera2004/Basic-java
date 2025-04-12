public class Switch {
    public static void main(String[] args)
    {
        char ch='f';
        switch(ch)
        {
            default:System.out.println("Unknown colour");
            case 'r':case 'R':System.out.println("Red");
            case 'g':case 'G':System.out.println("Green");break;
            case 'b':case 'B':System.out.println("Blue");
        }
    }
}
