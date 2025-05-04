package com.mycompany.le_project;

import java.util.Scanner;

public class Clothes extends CursedArtifacts {

    Decision dc = new Decision();
    Scanner sc = new Scanner(System.in);

    @Override
    public int question(String[] choices) {
        System.out.println("Ohhh what clothes do you want?");
        dc.ask(choices);
        return sc.nextInt();
    }

    @Override
    public void displayInfo() {
        System.out.println("These garments bear the burdens of their past wearers — pain, betrayal, and sometimes murder.");
        System.out.println("Wearing them alters more than appearance; they affect your emotions and even your fate.\n");
    }

    @Override
    public void openItem() {
        System.out.println("The fabric feels strangely alive. A shiver runs down your spine as you unfold the clothing.\n");
    }

    @Override
    public void price() {
        System.out.println("Prices start at ₱60,000 and increase with paranormal potency.\n");
    }
}
