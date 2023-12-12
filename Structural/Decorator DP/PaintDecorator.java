public class PaintDecorator extends Decorator{
 //Currency currency;      IMP
 //int x;

 public PaintDecorator(Textbox t){
  super.component = t;
 }

 public String getDescription(){
  return ("Nothing"); 
 }
public double show(String v){
super.show(v);
  return 100;
}
}
