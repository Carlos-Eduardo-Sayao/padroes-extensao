package visitor;

public class Main {

    public static void main(String[] args) {

        Produto livro =
                new Livro("Java Básico", 100);

        Produto celular =
                new Eletronico("Celular", 2000);

        Visitante calculadora =
                new CalculadoraImposto();

        livro.aceitar(calculadora);

        celular.aceitar(calculadora);
    }
}
