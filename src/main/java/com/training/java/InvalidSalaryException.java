package com.training.java;
import java.lang.Exception;
public class InvalidSalaryException extends Exception{
    public InvalidSalaryException() {
        super();
    }
    public InvalidSalaryException(String message) {
        super(message);
    }
}
