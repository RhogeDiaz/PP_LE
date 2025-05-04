package com.mycompany.le_project.totems;

import com.mycompany.le_project.Totems;

public class Sukuna extends Totems {

    @Override
    public void displayInfo() {
        System.out.println("A preserved finger said to belong to Ryomen Sukuna — a king of curses.");
        System.out.println("Holding it makes your body tremble, as if another presence is trying to take over.\n");
    }

    @Override
    public void openItem() {
        System.out.println("The air thickens. Your reflection grins before you do.\n");
    }

    @Override
    public void price() {
        System.out.println("Price: ₱300,000 — Includes containment scrolls and exorcist referral.\n");
    }

}
