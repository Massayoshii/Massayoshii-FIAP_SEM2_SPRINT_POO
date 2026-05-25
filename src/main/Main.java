package main;

import model.TrechoRodovia;

public class Main {
    static void main() {
        TrechoRodovia trecho1 = new TrechoRodovia(10,15,10);
        TrechoRodovia trecho2 = new TrechoRodovia(20,25,5);

        trecho1.registrarCrescimento(5);
        trecho2.registrarCrescimento(10);

        System.out.println(trecho1);
        System.out.println(trecho2);
    }
}