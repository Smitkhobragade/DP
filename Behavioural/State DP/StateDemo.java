public class StateDemo {

    public static void main(String[] args) {
    
        AlertStateContext alertStateContext= new AlertStateContext();
        alertStateContext.work();
        
        System.out.println("===================");
        
        alertStateContext.setState(new Vibration());
        alertStateContext.work();
    }
    
}
