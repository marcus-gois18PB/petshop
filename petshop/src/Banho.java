public class Banho extends ServicoBase {
    private TamPelo pelo;

    public Banho(int cod, LocalDate data, Tamanho tamanho, TamPelo pelo) {
        super(cod, data, tamanho);
        this.pelo = pelo;
        this.preco = calculaPreco(); // Atualiza com a regra específica
    }

    @Override
    public double calculaPreco() {
        double valorBase = switch (tamanho) {
            case PEQUENO -> 50.0;
            case MEDIO -> 60.0;
            case GRANDE -> 70.0;
        };

        double acrescimoPelo = switch (pelo) {
            case CURTO -> 0.0;
            case MEDIO -> 15.0;
            case LONGO -> 25.0;
        };

        return valorBase + acrescimoPelo;
    }

    @Override
    public String getDescricao() {
        return "Banho - " + tamanho + " / Pêlo " + pelo;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s | Data: %s | Preço: R$ %.2f", cod, getDescricao(), data, calculaPreco());
    }
}
