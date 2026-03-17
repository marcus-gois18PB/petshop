import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciamos apenas a Fachada
        InventarioFachada fachada = new InventarioFachada();

        // 2. Usamos a fachada para registrar os serviços de forma simples
        // Exemplo 1: Banho em animal PEQUENO com pêlo CURTO (R$ 50,00)
        fachada.registrarBanho(101, LocalDate.now(), Tamanho.PEQUENO, TamPelo.CURTO);
        
        // Exemplo 2: Banho em animal GRANDE com pêlo LONGO (R$ 70,00 + R$ 25,00 = R$ 95,00)
        fachada.registrarBanho(102, LocalDate.now(), Tamanho.GRANDE, TamPelo.LONGO);

        // Exemplo 3: Hotelzinho para animal MÉDIO por 4 horas (4 * R$ 18,00 = R$ 72,00)
        fachada.registrarHotelzinho(103, LocalDate.now(), Tamanho.MEDIO, 4.0);

        // Exemplo 4: Tosa em animal PEQUENO (R$ 30,00)
        fachada.registrarTosa(104, LocalDate.now(), Tamanho.PEQUENO);

        // 3. Imprimimos o relatório
        System.out.println(fachada.emitirRelatorioCompleto());
    }
}
