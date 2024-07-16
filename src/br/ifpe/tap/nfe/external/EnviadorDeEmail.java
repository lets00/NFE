package br.ifpe.tap.nfe.external;

import br.ifpe.tap.nfe.interfaces.AcaoPosNotas;
import br.ifpe.tap.nfe.models.NotaFiscal;

public class EnviadorDeEmail implements AcaoPosNotas {
    private String nome;
    private String email;

    public EnviadorDeEmail(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    public String enviaEmail(NotaFiscal nf) {
        return String.format("Enviando e-mail para %s com a nota de ID %d...", email, nf.getNumeroNF());
    }

    @Override
    public String acao(NotaFiscal nf) {
        return enviaEmail(nf);
    }
}
