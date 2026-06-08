package padroesestruturais.flyweight;

public class Cor {
    private String nome;
    private String codigo;

    public Cor(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }
}