package decorator;

public class PagamentoComSeguro extends PagamentoDecorator {

    private double seguro;

    public PagamentoComSeguro(Pagamento pagamento, double seguro) {
        super(pagamento);
        this.seguro = seguro;
    }

    public double calcularValor() {
        return pagamento.calcularValor() + seguro;
    }

    public void processar() {
        pagamento.processar();
        System.out.println("Seguro adicionado: R$ " + seguro);
    }
}