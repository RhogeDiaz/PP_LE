package com.mycompany.le_project.totems;

import com.mycompany.le_project.Totems;

public class Enchantment extends Totems {

    @Override
    public void displayInfo() {
        System.out.println("This ancient book whispers in tongues only the mad understand.");
        System.out.println("Its pages rearrange themselves at night, binding the reader with unknown spells.\n");
    }

    @Override
    public void openItem() {
        System.out.println("As you crack it open, your vision blurs and the words glow faintly purple.\n");
    }

    @Override
    public void price() {
        System.out.println("Price: ₱130,000 — Includes enchanted gloves and a memory-erasing salve.\n");
    }
}
