package com.mycompany.le_project.totems;

import com.mycompany.le_project.Totems;

public class GoldenApple extends Totems {

    @Override
    public void displayInfo() {
        System.out.println("A shimmering golden apple with a flawless surface, tempting and terrifying.\n");
        System.out.println("It is said that a single bite reveals your darkest desire — and curses you with it.\n");
    }

    @Override
    public void openItem() {
        System.out.println("As you lift the apple, your mouth waters. A heartbeat echoes in your ears... but it’s not yours.\n");
    }

    @Override
    public void price() {
        System.out.println("Price: ₱175,000 — Includes a glass case and anti-glamour charm.\n");
    }

}
