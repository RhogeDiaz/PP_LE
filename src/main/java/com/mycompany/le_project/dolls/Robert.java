package com.mycompany.le_project.dolls;

import com.mycompany.le_project.Dolls;

public class Robert extends Dolls {

    @Override
    public void displayInfo() {
        System.out.println("Robert the Doll is an infamous cursed doll from Key West, Florida.");
        System.out.println("People say misfortunes follow those who mock or take his photo without permission.\n");
    }

    @Override
    public void openItem() {
        System.out.println("A cold shadow passes behind you. A child's laughter is heard—though you're alone.\n");
    }

    @Override
    public void price() {
        System.out.println("Price: ₱180,000 — Comes with a warning label and apology letter template.\n");
    }
}
