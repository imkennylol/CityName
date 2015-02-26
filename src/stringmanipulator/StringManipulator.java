/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulator;

import java.util.Scanner;

/**
 *
 * @author Kenny Tsang "wingpankenny.tsang@mail.citytech.cuny.edu"
 */
public class StringManipulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Please enter the name of your favorite city: ");
    String cityName = keyboard.nextLine();
    keyboard.close();
    
    System.out.println("The number of characters: " + cityName.length());
    System.out.println(cityName.toUpperCase());
    System.out.println(cityName.toLowerCase());
    System.out.println(cityName.charAt(0));
    }
    
}
