public class Singleton {
    protected int age;
    protected String name;
    private static Singleton singleInstance;
    protected Singleton(){}
    public static Singleton getInstance(){                // should not be final if required to be overridden by extended classes
        if(singleInstance==null)  
          return (singleInstance=new Singleton());
        return singleInstance;
    }
    final public void setSingletonInstance(int a, String name){
        this.age=a;
        this.name=name;
    }
    final public String toString(){
        return("age=========" + age+"           Name="+name);
    }
}

/*public class Singleton {
    private int age;
    private String name;
    private static Singleton singleInstance=null;
    private Singleton(){}
    public static Singleton getInstance(){
      if(singleInstance==null)  
          return new Singleton();
      return singleInstance;
    }
    public void setSingletonInstance(int a, String name){
        this.age=a;
        this.name=name;
    }
    public String toString(){
        return("age=" + age+"           Name="+name);
    }
}
*/