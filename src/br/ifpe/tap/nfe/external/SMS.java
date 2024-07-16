package br.ifpe.tap.nfe.external;

import br.ifpe.tap.nfe.interfaces.AcaoPosNotas;
import br.ifpe.tap.nfe.models.NotaFiscal;

public class SMS implements AcaoPosNotas {
    public SMS(){}
    public String enviaSms(NotaFiscal nf) {
        return String.format("Enviando nota fiscal %d...", nf.getNumeroNF());
    }

    @Override
    public String acao(NotaFiscal nf) {
        return enviaSms(nf);
    }
}
