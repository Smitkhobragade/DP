public class DecratorTextDemo {

    public static void main(String[] args) {
    Textbox t1 = new PaintDecorator(new PaintTextbox());
    System.out.println(t1.getDescription()); 
    System.out.println(t1.show("")); 
    
    
    Textbox t2 = new PaintDecorator(new DocDecorator(new DocTextbox()));
    System.out.println(t2.getDescription()); 
    System.out.println(t2.show("")); 

    
    }   
    
}
