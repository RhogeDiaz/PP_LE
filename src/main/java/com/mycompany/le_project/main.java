/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.le_project;

import java.util.Scanner;
/**a
 *
 * @author rvadi
 */
public class main{

    public static void main(String[] args) {
        Decision d = new Decision();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Welcome to our Curse(!) Artifact Store! \n\nWoud you like to purchase something?(yes/NO) ");
        String firstC = sc.next();

        while(true) {
            if (firstC.equalsIgnoreCase("yes")) {
                d.choose();
            } else {
                System.out.println("Wrong input mate *turns off*");
                break;
            }

            System.out.print("Would you like purchase again?(yes/NO) ");
            firstC = sc.next();
            if (firstC.equalsIgnoreCase("yes")) {
            }
            else{
                System.out.println("\nOkayyy *Turns off*");
                break;
            }
        }
    }
}
