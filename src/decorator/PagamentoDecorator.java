package decorator;

public abstract class PagamentoDecorator implements Pagamento {

    protected Pagamento pagamento;

    public PagamentoDecorator(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public double calcularValor() {
        return pagamento.calcularValor();
    }

    public void processar() {
        pagamento.processar();
    }
}
