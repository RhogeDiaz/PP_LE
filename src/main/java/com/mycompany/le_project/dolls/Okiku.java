package com.mycompany.le_project.dolls;

import com.mycompany.le_project.Dolls;

public class Okiku extends Dolls {

    @Override
    public void displayInfo() {
        System.out.println("Okiku is a Japanese doll haunted by a young girl's spirit. Her hair is said to grow over time.");
        System.out.println("Housed at Mannenji Temple in Hokkaido, Japan.\n");
    }

    @Override
    public void openItem() {
        System.out.println("The doll’s gaze feels alive. A soft whisper in Japanese echoes in the room.\n");
    }

    @Override
    public void price() {
        System.out.println("Price: ₱120,000 — Comes with maintenance instructions for hair trimming.\n");
    }
}
