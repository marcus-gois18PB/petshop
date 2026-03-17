import java.time.LocalDate;

public class InventarioFachada {
    // A fachada "esconde" o inventário real dentro dela
    private InventarioPetshop inventario;

    public InventarioFachada() {
        this.inventario = new InventarioPetshop();
    }

    // Métodos simplificados para a Main chamar
    public void registrarBanho(int cod, LocalDate data, Tamanho tamanho, TamPelo pelo) {
        ServicoIF banho = new Banho(cod, data, tamanho, pelo);
        inventario.adicionaServico(banho);
    }

    public void registrarHotelzinho(int cod, LocalDate data, Tamanho tamanho, double qtdHoras) {
        ServicoIF hotel = new Hotelzinho(cod, data, tamanho, qtdHoras);
        inventario.adicionaServico(hotel);
    }

    public void registrarTosa(int cod, LocalDate data, Tamanho tamanho) {
        ServicoIF tosa = new Tosa(cod, data, tamanho);
        inventario.adicionaServico(tosa);
    }

    // Apenas repassa o pedido de relatório para o inventário
    public String emitirRelatorioCompleto() {
        return inventario.geraRelatorio();
    }
}

