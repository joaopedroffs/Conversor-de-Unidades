import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== Conversor de Unidades ===");
            System.out.println("Escolha o tipo de conversão:");
            System.out.println("1. Comprimento (metros ↔ quilômetros)");
            System.out.println("2. Temperatura (Celsius ↔ Fahrenheit)");
            System.out.println("3. Peso (quilos ↔ libras)");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    converterComprimento(scanner);
                    break;
                case 2:
                    converterTemperatura(scanner);
                    break;
                case 3:
                    converterPeso(scanner);
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    public static void converterComprimento(Scanner scanner) {
        System.out.println("Conversão de Comprimento");
        System.out.println("1. Metros para Quilômetros");
        System.out.println("2. Quilômetros para Metros");
        System.out.print("Escolha a conversão: ");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.print("Digite o valor em metros: ");
            double metros = scanner.nextDouble();
            double quilometros = metros / 1000;
            System.out.println(metros + " metros = " + quilometros + " quilômetros");
        } else if (escolha == 2) {
            System.out.print("Digite o valor em quilômetros: ");
            double quilometros = scanner.nextDouble();
            double metros = quilometros * 1000;
            System.out.println(quilometros + " quilômetros = " + metros + " metros");
        } else {
            System.out.println("Opção inválida.");
        }
    }

    public static void converterTemperatura(Scanner scanner) {
        System.out.println("Conversão de Temperatura");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.print("Escolha a conversão: ");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.print("Digite o valor em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println(celsius + " °C = " + fahrenheit + " °F");
        } else if (escolha == 2) {
            System.out.print("Digite o valor em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println(fahrenheit + " °F = " + celsius + " °C");
        } else {
            System.out.println("Opção inválida.");
        }
    }

    public static void converterPeso(Scanner scanner) {
        System.out.println("Conversão de Peso");
        System.out.println("1. Quilos para Libras");
        System.out.println("2. Libras para Quilos");
        System.out.print("Escolha a conversão: ");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.print("Digite o valor em quilos: ");
            double quilos = scanner.nextDouble();
            double libras = quilos * 2.20462;
            System.out.println(quilos + " quilos = " + libras + " libras");
        } else if (escolha == 2) {
            System.out.print("Digite o valor em libras: ");
            double libras = scanner.nextDouble();
            double quilos = libras / 2.20462;
            System.out.println(libras + " libras = " + quilos + " quilos");
        } else {
            System.out.println("Opção inválida.");
        }
    }
}