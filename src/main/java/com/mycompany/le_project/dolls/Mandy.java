package com.mycompany.le_project.dolls;

import com.mycompany.le_project.Dolls;

public class Mandy extends Dolls {

    @Override
    public void displayInfo() {
        System.out.println("Mandy is an antique porcelain doll from Canada rumored to cry and move around on her own.\n");
        System.out.println("She now resides in the Quesnel Museum, reportedly disrupting electronics.\n");
    }

    @Override
    public void openItem() {
        System.out.println("You open the case and hear soft crying. The air grows cold, and lights flicker briefly.\n");
    }

    @Override
    public void price() {
        System.out.println("Price: ₱95,000 — Includes a reinforced display case and EMF protection.\n");
    }
}
