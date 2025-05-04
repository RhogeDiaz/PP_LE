package com.mycompany.le_project.clothes;

import com.mycompany.le_project.Clothes;

public class Medium extends Clothes {

    @Override
    public void displayInfo() {
        System.out.println("This medium-sized shirt feels... warm. Too warm.");
        System.out.println("Rumors say whoever wears it experiences a vivid life that isn't theirs.\n");
    }

    @Override
    public void openItem() {
        System.out.println("As you touch the fabric, a whisper calls your name from behind you.\n");
    }

    @Override
    public void price() {
        System.out.println("Price: ₱90,000 — Includes a dreamcatcher to reduce memory overlaps.\n");
    }
}
