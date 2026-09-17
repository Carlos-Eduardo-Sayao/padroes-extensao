package decorator;

public class PagamentoPix implements Pagamento {

    private double valor;

    public PagamentoPix(double valor) {
        this.valor = valor;
    }

    public double calcularValor() {
        return valor;
    }

    public void processar() {
        System.out.println("Pagamento realizado via PIX.");
    }
}