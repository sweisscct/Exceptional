/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptional;

/**
 *
 * @author Lecturer
 */
public class ZeroLengthException extends InvalidLengthException {

    public ZeroLengthException() {
        super("The length of a shape cannot be 0.");
    }

    public ZeroLengthException(String message) {
        super(message);
    }
    
}
