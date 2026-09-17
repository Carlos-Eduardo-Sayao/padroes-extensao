package visitor;

public class CalculadoraImposto implements Visitante {

    public void visitar(Livro livro) {

        double imposto = livro.getPreco() * 0.05;

        System.out.printf(
                "Imposto do livro: R$ %.2f%n",
                imposto
        );
    }

    public void visitar(Eletronico eletronico) {

        double imposto = eletronico.getPreco() * 0.15;

        System.out.printf(
                "Imposto do eletrônico: R$ %.2f%n",
                imposto
        );
    }
}
