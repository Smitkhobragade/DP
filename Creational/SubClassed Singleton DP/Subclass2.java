public class Subclass2 extends Singleton {
    private static Subclass2 singleInstance2;
    public static Subclass2 getInstance(){
        if(singleInstance2==null)
            singleInstance2=new Subclass2();
        return singleInstance2;
    }
}
