/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.le_project;

import java.util.Scanner;
/**
 *
 * @author rvadi
 */
public class main{

    public static void main(String[] args) {
        System.out.println("Hello World!");
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Choose one: ");
        String choice = input.nextLine();
        
        System.out.println("You chosen " + choice);
    }
}
