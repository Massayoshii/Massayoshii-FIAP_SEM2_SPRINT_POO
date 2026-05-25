package main;

import model.RelatorioPrioridade;
import model.TrechoRodovia;

public class Main {

    public static void main(String[] args) {

        TrechoRodovia trecho1 = new TrechoRodovia(10, 15, 10, "umido");

        TrechoRodovia trecho2 = new TrechoRodovia(20, 25, 5, "seco");

        TrechoRodovia trecho3 = new TrechoRodovia(30, 35, 18, "umido");

        trecho1.registrarCrescimentoAutomatico();
        trecho2.registrarCrescimentoAutomatico();
        trecho3.registrarCrescimentoAutomatico();

        trecho2.transmitirDadosSensor(8);

        TrechoRodovia[] trechos = {trecho1, trecho2, trecho3};

        RelatorioPrioridade relatorio = new RelatorioPrioridade();
        relatorio.gerarRelatiorio(trechos);
    }
}