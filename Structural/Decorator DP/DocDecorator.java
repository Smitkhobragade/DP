public class DocDecorator extends Decorator{
 
 public DocDecorator(Textbox t){
  super.component = t;
 }

 public String getDescription(){
  return ("You can type text here"); 
 }
public double show(String v){
super.show(v);
  return 500;
}
}
