package com.mycompany.le_project;

import com.mycompany.le_project.dolls.*;
import com.mycompany.le_project.clothes.*;
import com.mycompany.le_project.totems.*;

import java.util.Scanner;

public class Decision {
    void choose(){
        CursedArtifacts Ca = null;
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
                case 1 -> Ca = new Annabelle();
                case 2 -> Ca = new Robert();
                case 3 -> Ca = new Okiku();
                case 4 -> Ca = new Mandy();
                case 5 -> Ca = new Letta();
                default -> System.out.println("Wrong input mate *turns off*");
            }
        }
        if(chosenCategory == 2){
            switch(chosenItem){
                case 1 -> Ca = new CloakofVladtheImpaler();
                case 2 -> Ca = new GlovesofGillesGarnier();
                case 3 -> Ca = new Small();
                case 4 -> Ca = new Medium();
                case 5 -> Ca = new Oversized();
                default -> System.out.println("Wrong input mate *turns off*");
            }
        }
        if(chosenCategory == 3){
            switch(chosenItem){
                case 1 -> Ca = new Undying();
                case 2 -> Ca = new GoldenApple();
                case 3 -> Ca = new Enchantment();
                case 4 -> Ca = new Sukuna();
                case 5 -> Ca = new Finger();
                default -> System.out.println("Wrong input mate *turns off*");
            }
        }

        Ca.openItem();
        Ca.displayInfo();
        Ca.price();
    }

    void ask(String[] choices){
        for(int i = 0; i < choices.length; i++){
            System.out.println("[" + (i + 1) + "] " + choices[i]);
        }
        System.out.print("\nYour answer: " );
    }
}
