package visitor;

public class Eletronico implements Produto {

    private String nome;
    private double preco;

    public Eletronico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void aceitar(Visitante visitante) {
        visitante.visitar(this);
    }
}