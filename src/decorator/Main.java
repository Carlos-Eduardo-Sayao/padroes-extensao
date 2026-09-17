package decorator;

public class Main {

    public static void main(String[] args) {

        Pagamento pagamento = new PagamentoPix(100);

        pagamento = new PagamentoComTaxa(pagamento, 5);

        pagamento = new PagamentoComSeguro(pagamento, 10);

        pagamento.processar();

        System.out.printf(
                "Valor final: R$ %.2f%n",
                pagamento.calcularValor()
        );
    }
}
