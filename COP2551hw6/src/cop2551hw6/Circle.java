package cop2551hw6;

public class Circle extends Shape{

Shape circle = new Shape();
double radius;


@Override protected void calcArea(){
    area = (radius * Math.PI)^2;
    
}

}
