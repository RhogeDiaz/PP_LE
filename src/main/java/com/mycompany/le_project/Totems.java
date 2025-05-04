package com.mycompany.le_project;

import java.util.Scanner;

public class Totems extends CursedArtifacts {

    Decision dc = new Decision();
    Scanner sc = new Scanner(System.in);

    @Override
    public int question(String[] choices) {
        System.out.println("What Totem would you like to add to your collection?");
        dc.ask(choices);
        return sc.nextInt();
    }

    @Override
    public void displayInfo() {
        System.out.println("Totems are cursed relics tied to ancient rituals, dark bargains, or powerful spirits.");
        System.out.println("They are small, but their influence is dangerously large and long-lasting.\n");
    }

    @Override
    public void openItem() {
        System.out.println("As you lift the totem, the lights flicker and the room suddenly grows silent.\n");
    }

    @Override
    public void price() {
        System.out.println("Prices range from ₱95,000 to ₱300,000 depending on spiritual risk and historical value.\n");
    }
}
