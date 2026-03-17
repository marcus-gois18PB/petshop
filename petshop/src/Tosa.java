public class Tosa extends ServicoBase {

    public Tosa(int cod, LocalDate data, Tamanho tamanho) {
        super(cod, data, tamanho);
        this.preco = calculaPreco();
    }

    @Override
    public double calculaPreco() {
        return switch (tamanho) {
            case PEQUENO -> 30.0;
            case MEDIO -> 40.0;
            case GRANDE -> 50.0;
        };
    }

    @Override
    public String getDescricao() {
        return "Tosa - " + tamanho;
    }

    @Override
    public String toString() {
         return String.format("[%d] %s | Data: %s | Preço: R$ %.2f", cod, getDescricao(), data, calculaPreco());
    }
}
