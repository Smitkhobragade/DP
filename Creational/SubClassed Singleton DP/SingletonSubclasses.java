public class SingletonSubclasses {

        public static void main(String[] args) {
        System.out.println("Singleton Patternnnnnnnnnnnnnnnnnn");
        
        Singleton object1= Singleton.getInstance();
        object1.setSingletonInstance(39,"PM........");
        System.out.println(object1);
        
        /*Singleton object2=new Singleton();         // No Exception at Compile time
        System.out.println(object2);
        */
        
        Subclass1 object3=Subclass1.getInstance();
        object3.setSingletonInstance(44,"Due to sub class 1 PM........");
        //System.out.println(object3);
       
        Subclass2 object4=Subclass2.getInstance();
        object4.setSingletonInstance(55,"Due to sub class 2 PM........");
      //  System.out.println(object4);
        
        System.out.println("__________________________________________");
        System.out.println(object1);
        //object3.display();
        //object4.display();
        
        System.out.println(object3);
        System.out.println(object4);
        
        
    }

    
}
