package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class TesteUnitarioFlyweight {

    @Test
    public void testAdiciarRoupasComMesmaCor() {
        Loja loja = new Loja();
        loja.adicionar("Camiseta", "Vermelho", "#FF0000");
        loja.adicionar("Calca", "Vermelho", "#FF0000");
        loja.adicionar("Jaqueta", "Vermelho", "#FF0000");
        assertEquals(1, CorFactory.getTotalCores());
    }

    @Test
    public void testAdicioarRoupasComCoresDiferentes() {
        Loja loja = new Loja();
        loja.adicionar("Camiseta", "Azul", "#0000FF");
        loja.adicionar("Calca", "Preto", "#000000");
        loja.adicionar("Jaqueta", "Branco", "#FFFFFF");
        assertEquals(3, CorFactory.getTotalCores());
    }

    @Test
    public void testReutilizacaoDeCores() {
        Loja loja = new Loja();
        loja.adicionar("Camisa", "Verde", "#00FF00");
        loja.adicionar("Blusa", "Verde", "#00FF00");
        loja.adicionar("Vestido", "Verde", "#00FF00");
        loja.adicionar("Shorts", "Vermelho", "#FF0000");
        assertEquals(2, CorFactory.getTotalCores());
    }

    @Test
    public void testObterRoupas() {
        Loja loja = new Loja();
        loja.adicionar("Tshirt", "Rosa", "#FFC0CB");
        loja.adicionar("Saia", "Rosa", "#FFC0CB");
        List<String> roupas = loja.obterRoupas();
        assertEquals(2, roupas.size());
    }

    @Test
    public void testConteudoRoupas() {
        Loja loja = new Loja();
        loja.adicionar("Polo", "Cinza", "#808080");
        List<String> roupas = loja.obterRoupas();
        assertTrue(roupas.get(0).contains("Polo"));
        assertTrue(roupas.get(0).contains("Cinza"));
    }
}