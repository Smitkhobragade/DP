public class AbstractFactoryPen {
public static void main(String[] args) {
    
    Pen p=new Gel(     );
    //p=new Sketch();
    Pen product=p.createProduct();
    product.write();


}
}
