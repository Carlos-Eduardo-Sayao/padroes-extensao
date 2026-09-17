package iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();

        carrinho.adicionarProduto(
                new Produto("Celular", 3500)
        );

        carrinho.adicionarProduto(
                new Produto("Carregador", 100)
        );

        carrinho.adicionarProduto(
                new Produto("Fone bluetooth", 200)
        );

        Iterator<Produto> iterator = carrinho.iterator();

        while (iterator.hasNext()) {

            Produto produto = iterator.next();

            System.out.printf(
                    "%s - R$ %.2f%n",
                    produto.getNome(),
                    produto.getPreco()
            );
        }
    }
}