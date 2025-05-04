package com.mycompany.le_project.totems;

import com.mycompany.le_project.Totems;

public class Finger extends Totems {

    @Override
    public void displayInfo() {
        System.out.println("This mummified finger twitches at night and points toward unknown graves.");
        System.out.println("Said to belong to a warlock who cursed his betrayers — and still seeks vengeance.\n");
    }

    @Override
    public void openItem() {
        System.out.println("You unwrap it, and a foul odor fills the room. The finger bends slowly, pointing at you.\n");
    }

    @Override
    public void price() {
        System.out.println("Price: ₱95,000 — Sold in a sealed jar with protective warding powder.\n");
    }
}
