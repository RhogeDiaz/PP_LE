package com.mycompany.le_project.clothes;

import com.mycompany.le_project.Clothes;

public class CloakofVladtheImpaler extends Clothes {

    @Override
    public void displayInfo() {
        System.out.println("This blood-red cloak is said to have belonged to Vlad the Impaler himself.");
        System.out.println("It is unnaturally cold to the touch and carries a faint scent of iron and smoke.\n");
    }

    @Override
    public void openItem() {
        System.out.println("The cloak unfurls by itself, casting a long shadow against the wall… but you're standing still.\n");
    }

    @Override
    public void price() {
        System.out.println("Price: ₱250,000 — Includes silver-lined hangers and historical documentation.\n");
    }
}
