import java.time.LocalDate;
import java.util.Scanner;

public class WhatsappBotPetshop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventarioFachada fachada = new InventarioFachada();
        
        // Simula o ID no banco de dados, incrementando a cada serviço
        int geradorCodigo = 1; 
        boolean lojaAberta = true;

      private static Tamanho perguntarTamanho(Scanner scanner) {
        System.out.println("Qual o porte do animal? [1] PEQUENO  [2] MÉDIO  [3] GRANDE");
        System.out.print("👉 ");
        String op = scanner.nextLine();
        return switch (op) {
            case "2" -> Tamanho.MEDIO;
            case "3" -> Tamanho.GRANDE;
            default -> Tamanho.PEQUENO; // Padrão caso digite errado
        };
    }

    private static TamPelo perguntarPelo(Scanner scanner) {
        System.out.println("Qual o tamanho do pêlo? [1] CURTO  [2] MÉDIO  [3] LONGO");
        System.out.print("👉 ");
        String op = scanner.nextLine();
        return switch (op) {
            case "2" -> TamPelo.MEDIO;
            case "3" -> TamPelo.LONGO;
            default -> TamPelo.CURTO; // Padrão caso digite errado
        };

        System.out.println("🤖 [CãoBot] Iniciando sistema de atendimento do Petshop...");

        while (lojaAberta) {
            System.out.println("\n=================================");
            System.out.println("📱 WHATSAPP PETSHOP - MENU INICIAL");
            System.out.println("=================================");
            System.out.println("Como posso ajudar o cliente hoje?");
            System.out.println("[1] 🛁 Agendar Banho");
            System.out.println("[2] ✂️ Agendar Tosa");
            System.out.println("[3] 🏨 Reservar Hotelzinho");
            System.out.println("[4] 🔒 Fechar a Loja (Emitir Relatório do Dia)");
            System.out.print("👉 Digite a opção: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("\n🤖 [CãoBot] Certo, vamos agendar um Banho.");
                    Tamanho tamBanho = perguntarTamanho(scanner);
                    TamPelo peloBanho = perguntarPelo(scanner);
                    fachada.registrarBanho(geradorCodigo++, LocalDate.now(), tamBanho, peloBanho);
                    System.out.println("✅ Banho agendado com sucesso!");
                    break;

                case "2":
                    System.out.println("\n🤖 [CãoBot] Certo, vamos agendar uma Tosa.");
                    Tamanho tamTosa = perguntarTamanho(scanner);
                    fachada.registrarTosa(geradorCodigo++, LocalDate.now(), tamTosa);
                    System.out.println("✅ Tosa agendada com sucesso!");
                    break;

                case "3":
                    System.out.println("\n🤖 [CãoBot] Certo, vamos reservar o Hotelzinho.");
                    Tamanho tamHotel = perguntarTamanho(scanner);
                    System.out.print("Quantas horas o pet vai ficar? 👉 ");
                    double horas = Double.parseDouble(scanner.nextLine());
                    fachada.registrarHotelzinho(geradorCodigo++, LocalDate.now(), tamHotel, horas);
                    System.out.println("✅ Hotel reservado com sucesso!");
                    break;

                case "4":
                    System.out.println("\n🤖 [CãoBot] Fechando a loja e gerando o balanço do dia...\n");
                    // Aqui a mágica da Fachada e do Polimorfismo acontece!
                    System.out.println(fachada.emitirRelatorioCompleto());
                    lojaAberta = false; // Quebra o loop e encerra o programa
                    break;

                default:
                    System.out.println("❌ Opção inválida. Tente novamente.");
            }
        }
        
        System.out.println("🌙 Sistema encerrado. Bom descanso!");
        scanner.close();
    }

  

    
    }
        }
