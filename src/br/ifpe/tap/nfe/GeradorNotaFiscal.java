package br.ifpe.tap.nfe;

import br.ifpe.tap.nfe.dao.NotaFiscalDAO;
import br.ifpe.tap.nfe.external.EnviadorDeEmail;
import br.ifpe.tap.nfe.external.SAP;
import br.ifpe.tap.nfe.external.SMS;
import br.ifpe.tap.nfe.interfaces.AcaoPosNotas;
import br.ifpe.tap.nfe.models.Fatura;
import br.ifpe.tap.nfe.models.NotaFiscal;

import java.util.List;

//import java.util.List;

// Integração com um sistema SAP
// Integrar com um sistema de análise estatíca

public class GeradorNotaFiscal {
    private List<AcaoPosNotas> acaoPosNotas;
    public GeradorNotaFiscal(List<AcaoPosNotas> acaoPosNotas) {
        this.acaoPosNotas = acaoPosNotas;
    }

    public NotaFiscal gera(Fatura fatura) {
        double valor = fatura.getValorMensal();
        NotaFiscal nf = new NotaFiscal(valor, impostoSimples(valor));
        for (int x = 0; x < acaoPosNotas.size(); x++) {
            acaoPosNotas.get(x).acao(nf);
        }
        return nf;
    }

    private double impostoSimples(double valor){
        return valor * 0.06;
    }
}
