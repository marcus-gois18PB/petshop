public class Hotelzinho extends ServicoBase {
    private double qtdHoras;

    public Hotelzinho(int cod, LocalDate data, Tamanho tamanho, double qtdHoras) {
        super(cod, data, tamanho);
        this.qtdHoras = qtdHoras;
        this.preco = calculaPreco();
    }

    public double getQtdHoras() { return qtdHoras; }

    @Override
    public double calculaPreco() {
        double valorHora = switch (tamanho) {
            case PEQUENO -> 12.0;
            case MEDIO -> 18.0;
            case GRANDE -> 25.0;
        };
        return qtdHoras * valorHora;
    }

    @Override
    public String getDescricao() {
        return "Hotelzinho - " + tamanho + " (" + qtdHoras + "h)";
    }

    @Override
    public String toString() {
         return String.format("[%d] %s | Data: %s | Preço: R$ %.2f", cod, getDescricao(), data, calculaPreco());
    }
}
