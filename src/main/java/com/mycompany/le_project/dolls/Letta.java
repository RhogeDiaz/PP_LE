package com.mycompany.le_project.dolls;

import com.mycompany.le_project.Dolls;

public class Letta extends Dolls {

    @Override
    public void displayInfo() {
        System.out.println("Letta is a haunted marionette believed to be over 200 years old.");
        System.out.println("She’s known for moving on her own and causing emotional breakdowns in her presence.\n");
    }

    @Override
    public void openItem() {
        System.out.println("Her eyes seem to follow you. A sudden wind blows through the sealed room.\n");
    }

    @Override
    public void price() {
        System.out.println("Price: ₱100,000 — Comes with padded case and emotional resilience waiver.\n");
    }
}
