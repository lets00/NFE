package br.ifpe.tap.nfe.main;

import br.ifpe.tap.nfe.GeradorNotaFiscal;
import br.ifpe.tap.nfe.dao.NotaFiscalDAO;
import br.ifpe.tap.nfe.external.EnviadorDeEmail;
import br.ifpe.tap.nfe.external.SAP;
import br.ifpe.tap.nfe.external.SMS;
//import br.ifpe.tap.nfe.intefaces.AcaoExterna;
import br.ifpe.tap.nfe.interfaces.AcaoPosNotas;
import br.ifpe.tap.nfe.models.Fatura;
import br.ifpe.tap.nfe.models.NotaFiscal;

import java.util.ArrayList;
import java.util.List;

public class NFE {

    public static void main(String[] args){

        List<AcaoPosNotas> apn = new ArrayList<AcaoPosNotas>();
        Fatura faturaJoao = new Fatura(1000);

        EnviadorDeEmail gmail = new EnviadorDeEmail("João", "joao@gmail.com");
        NotaFiscalDAO nfPostgres = new NotaFiscalDAO();
        SMS sms = new SMS();
        SAP sap = new SAP();

        apn.add(gmail);
        apn.add(nfPostgres);
        apn.add(sms);
        apn.add(sap);

        GeradorNotaFiscal gnf = new GeradorNotaFiscal(apn);

        System.out.println("------------GNF-----------");
        System.out.println(faturaJoao.getValorMensal());

        System.out.println("------------Nota Fiscal-----------");
        NotaFiscal nf = gnf.gera(faturaJoao);
        System.out.println(nf.getTotal());
















//        GeradorNotaFiscal gnf = new GeradorNotaFiscal(gmail,nfPostgres,sms);
//        System.out.println("---------------Gerando NFE---------------");
//        NotaFiscal nfJoao = gnf.gera(faturaJoao);
//        System.out.println("---------------Resumo do Usuário João---------------");
//        System.out.println("Nota do João: " + nfJoao.getNumeroNF());
//        System.out.println("Valor sem imposto da nota de João: " + nfJoao.getValor());
//        System.out.println("Imposto da nota de João: " + nfJoao.getImposto());
//        System.out.println("Valor total da nota de João: " + nfJoao.getTotal());

    }
}
