package br.ifpe.tap.nfe.models;

public class Fatura {
    private double valor;

    public Fatura(double valor) {
        this.valor = valor;
    }

    // Obtém valor do mês atual
    public double getValorMensal() {
        return valor;
    }
}
