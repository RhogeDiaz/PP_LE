package com.mycompany.le_project;

import java.util.Scanner;

public class Dolls extends CursedArtifacts {

    Decision dc = new Decision();
    Scanner sc = new Scanner(System.in);

    @Override
    public int question(String[] choices) {
        System.out.println("So.. which Doll do you want?");
        dc.ask(choices);
        return sc.nextInt();
    }

    @Override
    public void displayInfo() {
        System.out.println("These dolls are more than toys — they're vessels for lingering souls and unspeakable energies.");
        System.out.println("Each one has a unique origin, but all have histories soaked in tragedy.\n");
    }

    @Override
    public void openItem() {
        System.out.println("You reach into the antique box, and a cold breeze brushes your fingertips.");
        System.out.println("A whisper echoes faintly, but there’s no one else in the room.\n");
    }

    @Override
    public void price() {
        System.out.println("Dolls range from ₱60,000 to ₱180,000 depending on their curse strength and activity level.\n");
    }
}
