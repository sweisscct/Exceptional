/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptional;

/**
 *
 * @author Lecturer
 */
public class Circle {
    int radius;

    public Circle(int radius) throws ZeroLengthException {
        if (radius == 0) {
            throw new ZeroLengthException();
        } else if (radius < 0) {
            throw new NegativeNumberException("Radius cannot be negative");
        }
        this.radius = radius;
    }
    
    
}
