/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptional;

/**
 *
 * @author Lecturer
 */
public class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        if (length < 0 || width < 0) {
            throw new NegativeNumberException("The sides must be positive");
        }
        this.length = length;
        this.width = width;
    }
    
    
}
