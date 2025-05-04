package com.mycompany.le_project.totems;

import com.mycompany.le_project.Totems;

public class Undying extends Totems {

    @Override
    public void displayInfo() {
        System.out.println("This small totem is warm to the touch and pulses with life... but at a cost.");
        System.out.println("Using it saves your life once — by stealing years from another.\n");
    }

    @Override
    public void openItem() {
        System.out.println("It glows for a moment, and your pulse skips. A name whispers itself into your mind.\n");
    }

    @Override
    public void price() {
        System.out.println("Price: ₱220,000 — Comes with terms-of-use agreement and a soulbinding clause.\n");
    }
}
