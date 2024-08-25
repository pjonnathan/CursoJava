package application;

import com.sun.jdi.event.ExceptionEvent;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the file: ");
        }
        catch (Exception e){
            System.out.println("Exception: " + e);
        }
    }
}
