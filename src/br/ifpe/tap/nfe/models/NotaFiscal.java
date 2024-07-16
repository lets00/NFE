package br.ifpe.tap.nfe.models;

public class NotaFiscal {
    private int numeroNF;
    private double valor;
    private double imposto;

    private final int SEED = 5000;

    public NotaFiscal(double valor, double imposto) {
        numeroNF = (int) (Math.random() * SEED);
        this.valor = valor;
        this.imposto = imposto;
    }

    public int getNumeroNF(){
        return numeroNF;
    }

    public double getValor() {
        return valor;
    }

    public double getImposto() {
        return imposto;
    }

    public double getTotal() {
        return valor + imposto;
    }
}
