package com.mycompany.le_project.dolls;

import com.mycompany.le_project.Dolls;

public class Annabelle extends Dolls {

    @Override
    public void displayInfo() {
        System.out.println("Annabelle is a cursed Raggedy Ann doll known for being possessed by a demonic spirit.");
        System.out.println("Currently contained in a glass case at the Warren's Occult Museum.\n");
    }

    @Override
    public void openItem() {
        System.out.println("As you attempt to open Annabelle’s box, a chilling breeze passes through.");
        System.out.println("Your fingers tremble… it’s as if something is watching you.\n");
    }

    @Override
    public void price() {
        System.out.println("Price: ₱150,000 — Includes a protective glass case and a priest's blessing.\n");
    }
}
