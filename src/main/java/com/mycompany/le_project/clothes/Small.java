package com.mycompany.le_project.clothes;

import com.mycompany.le_project.Clothes;

public class Small extends Clothes {

    @Override
    public void displayInfo() {
        System.out.println("This child-sized shirt is always slightly damp, despite any attempts to dry it.");
        System.out.println("Locals believe it cries at night for its original owner.\n");
    }

    @Override
    public void openItem() {
        System.out.println("You unwrap it and hear a child giggle... then a sob, then silence.\n");
    }

    @Override
    public void price() {
        System.out.println("Price: ₱60,000 — Delivered in a sealed case with no return policy.\n");
    }
}
