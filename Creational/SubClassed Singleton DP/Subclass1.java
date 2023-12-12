public class Subclass1 extends Singleton{
    private static Subclass1 singleInstance1;
    public static Subclass1 getInstance(){
        if(singleInstance1==null)
            singleInstance1=new Subclass1();
        return singleInstance1;
    }
    public void display(){
        System.out.println("age======================" + age+"           Name====================="+name);
    }
}
