package entity;

import sub.sistema.crm1.CrmService;
import sub.sistema.crm2.CepApi;

public class Facade {
    /*Interface mais simples para consumo mesmo faltando parâmetros*/
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getCepApi().recuperarCidade(cep);
        String estado = CepApi.getCepApi().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
