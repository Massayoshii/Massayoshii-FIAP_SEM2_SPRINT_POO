package model;

public class TrechoRodovia {
    private double quilometroInicial;
    private double quilometroFinal;
    private double nivelVegetacaoCm;

    public TrechoRodovia(double quilometroInicial, double quilometroFinal, double nivelVegetacaoCm) {
        this.setQuilometroInicial(quilometroInicial);
        this.setQuilometroFinal(quilometroFinal);
        this.setNivelVegetacaoCm(nivelVegetacaoCm);
        System.out.println("Trecho rodovia: Km inicial:"+ this.quilometroInicial + "km | Quilometro final:"+ this.quilometroFinal + "km | Nivel de vegetacao:"+ this.nivelVegetacaoCm + "cm");
    }

    public double getQuilometroInicial() {
        return quilometroInicial;
    }

    public double getQuilometroFinal() {
        return quilometroFinal;
    }

    public double getNivelVegetacaoCm() {
        return nivelVegetacaoCm;
    }


    public void registrarCrescimento(double taxa){
        if(taxa>0){
            nivelVegetacaoCm += taxa;
            System.out.println("Nivel de vegetacao aumentou para "+ this.nivelVegetacaoCm);
        }else {
            throw new IllegalArgumentException("A taxa nao pode ser 0 ou menor");
        }

    }

    public void setQuilometroInicial(double quilometroInicial) {
        if(quilometroInicial >= 0){
            this.quilometroInicial = quilometroInicial;
        }else {
            throw new IllegalArgumentException("Quilometro inicial nao pode ser negativo");
        }
    }

    public void setQuilometroFinal(double quilometroFinal) {
        if(quilometroFinal > quilometroInicial){
            this.quilometroFinal = quilometroFinal;
        }else {
            throw new IllegalArgumentException("Quilometro final nao pode ser maior que o quilometro inicial");
        }
    }

    public void setNivelVegetacaoCm(double nivelVegetacaoCm) {
        if(nivelVegetacaoCm >= 0){
            this.nivelVegetacaoCm = nivelVegetacaoCm;
        }else {
            throw new IllegalArgumentException("Nivel de vegetacao nao pode ser negativo");
        }
    }

    @Override
    public String toString() {
        return "Trecho KM " + quilometroInicial + " ao " + quilometroFinal +
                " | Vegetação: " + nivelVegetacaoCm + " cm";
    }
}