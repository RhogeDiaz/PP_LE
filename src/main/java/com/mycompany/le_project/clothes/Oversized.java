package com.mycompany.le_project.clothes;

import com.mycompany.le_project.Clothes;

public class Oversized extends Clothes {

    @Override
    public void displayInfo() {
        System.out.println("This oversized hoodie once belonged to a recluse who disappeared after locking themselves in.");
        System.out.println("Wearing it gives a sense of comfort—until you feel arms hugging you from the inside.\n");
    }

    @Override
    public void openItem() {
        System.out.println("The hoodie is warm and smells of rain. Then suddenly… you feel breath on your neck.\n");
    }

    @Override
    public void price() {
        System.out.println("Price: ₱110,000 — With a free sage bundle and blackout curtains.\n");
    }
}
