package padroesestruturais.flyweight;

public class Roupa {
    private String nome;
    private Cor cor;

    public Roupa(String nome, Cor cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public String obterRoupa() {
        return "Roupa{" +
                "nome='" + this.nome + '\'' +
                ", cor='" + cor.getNome() + '\'' +
                ", codigo='" + cor.getCodigo() + '\'' +
                '}';
    }
}