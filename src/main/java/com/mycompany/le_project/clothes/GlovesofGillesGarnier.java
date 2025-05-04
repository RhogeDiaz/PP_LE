package com.mycompany.le_project.clothes;

import com.mycompany.le_project.Clothes;

public class GlovesofGillesGarnier extends Clothes {

    @Override
    public void displayInfo() {
        System.out.println("These leather gloves were found near the grave of Gilles Garnier, the infamous French werewolf.");
        System.out.println("When worn, the gloves pulse slightly—like something inside them is still alive.\n");
    }

    @Override
    public void openItem() {
        System.out.println("You hear a growl in the distance. The gloves tighten on their own, clenching your fists.\n");
    }

    @Override
    public void price() {
        System.out.println("Price: ₱190,000 — Comes with wolfsbane extract and full moon warnings.\n");
    }
}
