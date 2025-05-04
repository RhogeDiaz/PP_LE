package com.mycompany.le_project;

import com.mycompany.le_project.dolls.*;
import com.mycompany.le_project.clothes.*;
import com.mycompany.le_project.totems.*;

import java.util.Scanner;

public class Decision {
    void choose(){
        CursedArtifacts Ca = null;
        CursedArtifacts Ca2 = null;
        Scanner sc = new Scanner(System.in);

        int chosenCategory, chosenItem = 0;
        String[] category = {"Dolls","Clothes","Totems"};
        String[] dolls = {"Annabelle","Robert","Okiku","Mandy","Letta"};
        String[] clothes = {"Cloak of Vlad the Impaler","Gloves of Gilles Garnier","Small","Medium","Oversize"};
        String[] totems = {"Undying","Golden Apple","Enchantment","sukuna","finger"};

        System.out.println("What category of cursed artifacts would you want? ");
        ask(category);
        chosenCategory = sc.nextInt();

        switch(chosenCategory){
            case 1:
                Ca = new Dolls();
                Ca.openItem();
                Ca.displayInfo();
                Ca.price();
                chosenItem = Ca.question(dolls);
                break;
            case 2:
                Ca = new Clothes();
                Ca.openItem();
                Ca.displayInfo();
                Ca.price();
                chosenItem = Ca.question(clothes);
                break;
            case 3:
                Ca = new Totems();
                Ca.openItem();
                Ca.displayInfo();
                Ca.price();
                chosenItem = Ca.question(totems);
                break;
            default:
                System.out.println("Wrong input mate *turns off*");
                break;
        }

        if(chosenCategory == 1) {
            switch (chosenItem) {
                case 1 -> Ca2 = new Annabelle();
                case 2 -> Ca2 = new Robert();
                case 3 -> Ca2 = new Okiku();
                case 4 -> Ca2 = new Mandy();
                case 5 -> Ca2 = new Letta();
                default -> System.out.println("Wrong input mate *turns off*");
            }
        }
        if(chosenCategory == 2){
            switch(chosenItem){
                case 1 -> Ca2 = new CloakofVladtheImpaler();
                case 2 -> Ca2 = new GlovesofGillesGarnier();
                case 3 -> Ca2 = new Small();
                case 4 -> Ca2 = new Medium();
                case 5 -> Ca2 = new Oversized();
                default -> System.out.println("Wrong input mate *turns off*");
            }
        }
        if(chosenCategory == 3){
            switch(chosenItem){
                case 1 -> Ca2 = new Undying();
                case 2 -> Ca2 = new GoldenApple();
                case 3 -> Ca2 = new Enchantment();
                case 4 -> Ca2 = new Sukuna();
                case 5 -> Ca2 = new Finger();
                default -> System.out.println("Wrong input mate *turns off*");
            }
        }

        if (Ca2 != null) {
            Ca2.openItem();
            Ca2.displayInfo();
            Ca2.price();
        }
    }

    void ask(String[] choices){
        for(int i = 0; i < choices.length; i++){
            System.out.println("[" + (i + 1) + "] " + choices[i]);
        }
        System.out.print("\nYour answer: " );
    }
}
