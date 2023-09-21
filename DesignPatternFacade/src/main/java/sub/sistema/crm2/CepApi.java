package sub.sistema.crm2;

public class CepApi {
    private static CepApi cepApi = new CepApi();

    private CepApi() {
    }

    public static CepApi getCepApi() {
        return cepApi;
    }

    public String recuperarCidade(String cep){
        return "São Paulo";
    }

    public String recuperarEstado(String cep){
        return "São Paulo";
    }
}
