import java.util.ArrayList;
import java.util.List;

public class InventarioPetshop {
    private List<ServicoIF> servicos;

    public InventarioPetshop() {
        this.servicos = new ArrayList<>();
    }

    public void adicionaServico(ServicoIF serv) {
        servicos.add(serv);
    }

    public String geraRelatorio() {
        StringBuilder sb = new StringBuilder();
        double totalArrecadado = 0.0;

        sb.append("=========================================\n");
        sb.append("       RELATÓRIO DE SERVIÇOS DO PETSHOP  \n");
        sb.append("=========================================\n");
        
        for (ServicoIF servico : servicos) {
            sb.append(servico.toString()).append("\n");
            totalArrecadado += servico.calculaPreco();
        }
        
        sb.append("-----------------------------------------\n");
        sb.append(String.format("TOTAL ARRECADADO: R$ %.2f\n", totalArrecadado));
        sb.append("=========================================\n");

        return sb.toString();
    }
}
