class CLA
{
public static void main(String[] args)
{
int i,s=0;
for(i=0;i<args.length;i++)
{
s=s+Integer.parseInt(args[i]);
}
System.out.println("Sum is "+s);
System.out.println("Averge is "+ s/args.length);
}
}