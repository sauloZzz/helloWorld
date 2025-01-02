/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author Saulo
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello world");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Write your name: ");
        String name = scanner.nextLine();
         
        System.out.println("Write your age ");
        int age = scanner.nextInt();
         
        scanner.nextLine();
         
        System.out.println("Write your gender: ");
        String gender = scanner.nextLine();
         
         System.out.println("Hello "+name);
         System.out.println("Your age is "+age);
         System.out.println("And you are a "+gender);
    }
    
}
