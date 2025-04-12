public class Cat {
    String name;
    int age;
    public Cat()
    {
        this.name="John";
        this.age=8;
    }
    public static void main(String[] args)
    {
        Cat c=new Cat();
        System.out.println("Cat name is "+ c.name);
        System.out.println("Age is "+ c.age);
    }
}
