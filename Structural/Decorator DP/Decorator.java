public abstract class Decorator extends Textbox{
    Textbox component;
    public abstract String getDescription();
    public double show(String value){
    return component.show("\\\\");
}
}
   