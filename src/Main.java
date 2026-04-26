import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro carro = new Carro();
        int opcao = 0;

        do {
            System.out.println("==========MENU==========");
            System.out.println();
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Virar");
            System.out.println("6 - Trocar a marcha");
            System.out.println("7 - Verificar a velocidade");
            System.out.println("8 - Sair");
            System.out.println("Escolhe uma opção do menu: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    carro.ligarCarro();
                    System.out.println("O carro está  " + carro.getIgnicao());
                    break;
                case 2:
                    carro.desligarCarro();
                    System.out.println("O carro está " + carro.getIgnicao());
                    break;
                case 3:
                    carro.acelerar();
                    System.out.println("A velocidade do veícula é de: " + carro.getVelocidade());
                    break;
                case 4:
                    carro.desacelerar();
                    System.out.println("A velocidade do veículo é de: " + carro.getVelocidade());
                    break;
                case 5:
                    carro.virar();
                    break;
                case 6:
                    carro.trocarMarcha();
                    System.out.println("O carro está na marcha: " + carro.getMarcha());
                    break;
                case 7:
                    System.out.println("A velocidade é: " + carro.getVelocidade());
                    break;
                case 8:
                    System.out.println("Saindo do programa");
            }
        } while (opcao != 8);

        scanner.close();
    }
}