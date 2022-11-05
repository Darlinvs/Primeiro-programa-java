import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá! Seja bem-vindo(a)! Eu sou uma assistente virtual");
        System.out.println("Por favor, digite seu nome:");
        String nome;
        nome = leitor.next();
        System.out.println("Obrigado(a) " +nome+ "! Agora me informe sua idade:");
        int idade;
        idade = leitor.nextInt();
        System.out.println("Ah! Ótimo! Agora me conta, qual serviço deseja agendar? Escolha uma opção:");
        System.out.println("[1] - CNH [2] - RG ");
        int opcao;
        opcao = leitor.nextInt();
        if(idade < 18 && opcao == 1){
            System.out.println("Você não tem idade suficiente para agendar esse serviço.");
        }if(idade > 18 && opcao == 1){
            System.out.println("Vamos agendar sua CNH. Vou verificar as datas disponíveis");
        }if(opcao == 2){
            System.out.println("Vamos agendar seu RG. Vou verificar as datas disponíveis.");
        }

        System.out.println("Escolha uma data: [1] 19/12/2022  [2] 20/12/2022  [3] 21/12/2022");
        int data;
        data = leitor.nextInt();

        switch (data){ //switch é utilizado quando só é possível escolher uma opção
            case 1: // Se a opção fosse letra, seria assim: 'a'
                System.out.println("Agendamento para dia 19/12/2022 feito com sucesso!");
                break;
            case 2:
                System.out.println("Agendamento para dia 20/12/2022 feito com sucesso!");
                break;
            case 3:
                System.out.println("Agendamento para dia 21/12/2022 feito com sucesso!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }




    }
}