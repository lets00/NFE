package br.ifpe.tap.nfe.external;

import br.ifpe.tap.nfe.interfaces.AcaoPosNotas;
import br.ifpe.tap.nfe.models.NotaFiscal;

public class SAP implements AcaoPosNotas {
    public SAP(){}

    public String acoesDoSAP(NotaFiscal nf) {
        return String.format("Tomando as acoes do SAP na nota %d...", nf.getNumeroNF());
        //...
    }

    @Override
    public String acao(NotaFiscal nf) {
        return acoesDoSAP(nf);
    }
}
