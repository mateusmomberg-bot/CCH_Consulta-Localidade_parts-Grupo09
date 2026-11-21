package utfpr.servico;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import utfpr.http.ClienteHttp;
import utfpr.model.UF;

public class LocalServico {
    private static final String BASE = "https://servicodados.ibge.gov.br/api/v1/localidades";

    private final ClienteHttp cliente;

    public LocalServico(ClienteHttp cliente) {
        this.cliente = cliente;
    }

    public List<UF> carregarUFs() {
        String json = cliente.buscaDados(BASE + "/estados?orderBy=nome");
        JSONArray array = new JSONArray(json);
        List<UF> ufs = new ArrayList<>();
        for (int i = 0; i < array.length(); i++) {
            JSONObject o = array.getJSONObject(i);
            ufs.add(new UF(o.getInt("id"), o.getString("nome"), o.getString("sigla")));
        }
        return ufs;
    }

}