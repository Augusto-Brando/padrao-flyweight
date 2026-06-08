package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CorFactory {
    private static Map<String, Cor> cores = new HashMap<>();

    public static Cor getCor(String nome, String codigo) {
        Cor cor = cores.get(nome);
        if (cor == null) {
            cor = new Cor(nome, codigo);
            cores.put(nome, cor);
        }
        return cor;
    }

    public static int getTotalCores() {
        return cores.size();
    }
}