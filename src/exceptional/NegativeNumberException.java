/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptional;

/**
 *
 * @author Lecturer
 */
public class NegativeNumberException extends ArithmeticException {
    public NegativeNumberException() {
        super();
    }
    
    public NegativeNumberException(String message) {
        super(message);
    } 
}
