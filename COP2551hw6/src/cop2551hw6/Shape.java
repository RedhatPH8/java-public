package cop2551hw6;


public class Shape {

protected double area, length, perimeter, width;

protected void calcArea (){
    
    area = length * width;
   }

protected void calcPerimeter (){
    
    perimeter= (2 * length) + (2 * width);
    }

protected double getArea () {
    this.calcArea();
}

protected double getPerimeter () {
    calcPerimeter();
}

protected void setLength (double length) {
    
}

}
