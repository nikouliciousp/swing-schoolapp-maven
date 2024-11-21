package gr.perisnik.cj.swing_schoolapp_maven.service.exceptions;

/**
 * This class represents a custom exception for handling Student DAO related errors.
 * It extends the Exception class and provides a constructor to specify the error message.
 * 
 * @version 0.1
 * @autor Peris Nik
 */
public class StudentNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;
    
    /**
     * Constructs a new StudentNotFoundException with the specified detail message.
     * 
     * @param s the detail message
     */
    public StudentNotFoundException(String s) {
        super(s);
    }
}