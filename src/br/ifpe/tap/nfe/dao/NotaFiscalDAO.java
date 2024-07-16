package br.ifpe.tap.nfe.dao;

import br.ifpe.tap.nfe.interfaces.AcaoPosNotas;
import br.ifpe.tap.nfe.models.NotaFiscal;

public class NotaFiscalDAO implements AcaoPosNotas {

    public NotaFiscalDAO(){}

    public String persiste(NotaFiscal nf) {
        return String.format("Persistindo Nota Fiscal de id %d...", nf.getNumeroNF());
    }

    @Override
    public String acao(NotaFiscal nf) {
        return persiste(nf);
    }
}
