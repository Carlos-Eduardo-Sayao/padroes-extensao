package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Carrinho implements Iterable<Produto> {

    private List<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public Iterator<Produto> iterator() {
        return produtos.iterator();
    }
}