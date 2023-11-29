/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptional;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Lecturer
 */
public class Exceptional {
    
    public static void coolMethod() throws IOException {
        System.out.println("Cool Method");
        throw new IOException("This is a cool IO exception");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input = Java is a runtime/uncheckedc expection
        // Java does not tell us about it in advance
        int input = sc.nextInt();
        System.out.println(input);
        // This is a checked exception
        // We cannot compile the code, even if it would not throw the exception
//        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        // Possible divide by zero exception (ArithmeticException)
        
        System.out.println(8/input);
        
        int[] numArray = {1, 1, 2, 3, 5, 8, 13};
        System.out.println(numArray[input]);
        
        try {
//        throw new Exception();
        throw new Exception("This is a general exception");
//            throw new FileNotFoundException("This is an IO exception");
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found!!");
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
            
            // Specific exceptions must be caught before more general ones.
//            } catch (FileNotFoundException e) {
//            System.out.println("The file is not found!!");
        }
        try{
            coolMethod();
        }  catch (FileNotFoundException e) {
            System.out.println("FoF Error");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally!");
        }
    }
    
}
