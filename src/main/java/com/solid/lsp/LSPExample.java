package com.solid.lsp;

public class LSPExample {
    public static void main(String[] args) {
        Bird bird1 = new Sparrow();
        Bird bird2 = new Ostrich();

        bird1.fly(); // Outputs: Sparrow is flying
        bird2.fly(); // Outputs: Bird is flying
    }
}