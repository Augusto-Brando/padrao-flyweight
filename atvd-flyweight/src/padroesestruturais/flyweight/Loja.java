package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Roupa> roupas = new ArrayList<>();

    public void adicionar(String nomeRoupa, String nomeCor, String codigo) {
        Cor cor = CorFactory.getCor(nomeCor, codigo);
        Roupa roupa = new Roupa(nomeRoupa, cor);
        roupas.add(roupa);
    }

    public List<String> obterRoupas() {
        List<String> saida = new ArrayList<String>();
        for (Roupa roupa : this.roupas) {
            saida.add(roupa.obterRoupa());
        }
        return saida;
    }
}