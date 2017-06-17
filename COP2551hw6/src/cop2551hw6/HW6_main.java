/*
* Author: Ryan Geddings N01067534
* Course: COP2551
* Homework #: 6
* Title : Abstraction and Encapsulation
* Due Date: 3/27/2016
*
* Use Abstraction, Encapsulation and inheritance concepts
 */
package cop2551hw6;

import java.util.Scanner;

/**
* Use Abstraction, Encapsulation and inheritance concepts
*/

public class HW6_main {

Scanner input = new Scanner(System.in);

    public void main(String[] args) {
    
        Circle circle = new Circle(radius);
        Rectangle rectangle = new Rectangle (length, width);
        
        System.out.println("Homework 6\nRyan Geddings, N01067534\n");
        System.out.println("Enter the radius of a circle [1 to 10]:");
                System.out.println("Enter the length of a rectangle [1 to 10]:");
        System.out.println("Enter the width of a rectangle [1 to 10]:");
    
        System.out.println("\nCircle:");
        System.out.print("\tArea:");
        Circle.getArea();
        System.out.println("\tPerimeter:");
        
        System.out.println("\nRectangle:");
        System.out.println("\tArea:");
        System.out.println("\tPerimeter:");
    }
    
}

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

package cop2551hw6;

public class Circle extends Shape{

Shape circle = new Shape();
double radius;


@Override protected void calcArea(){
    area = (radius * Math.PI)^2;
    
}


package cop2551hw6;

public class Rectangle extends Shape {
    
Shape rectange = new Shape();


        
}


}
