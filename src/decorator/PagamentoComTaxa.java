package decorator;

public class PagamentoComTaxa extends PagamentoDecorator {

    private double taxa;

    public PagamentoComTaxa(Pagamento pagamento, double taxa) {
        super(pagamento);
        this.taxa = taxa;
    }

    public double calcularValor() {
        return pagamento.calcularValor() + taxa;
    }

    public void processar() {
        pagamento.processar();
        System.out.println("Taxa de processamento: R$ " + taxa);
    }
}