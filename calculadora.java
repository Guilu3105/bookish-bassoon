import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
 System.out.println("CALCULADORA SIMPLES");

        int opcao;
        do{
            System.out.println("1 - somar");
            System.out.println("2 - subtrair");
            System.out.println("3 - multiplicar");
            System.out.println("4 - dividir");
            System.out.print("0 - aperte 0 para sair:");

            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            processar(opcao);
        } while (opcao != 0);
    }

    public static void processar(int opcao) {
        switch(opcao) {
            case 1: {
                Scanner scanner = new Scanner(System.in);
                System.out.println("SOMANDO DOIS NUMEROS:");
                System.out.print("  Digite o primeiro numero:");
                int numero1 = scanner.nextInt();
                System.out.print("Digite o segundo numero:");
                int numero2 = scanner.nextInt();

                int soma = numero1 + numero2;
                System.out.println("A soma dos dois numeros é: " + soma);
                break;
            
            }
 
            case 2: {
                Scanner scanner = new Scanner(System.in);
                System.out.println("SUBTRAINDANDO DOIS NUMEROS:");
                System.out.print("  Digite o primeiro numero:");
                int numero1 = scanner.nextInt();
                System.out.print("Digite o segundo numero:");
                int numero2 = scanner.nextInt();

                int subtracao = numero1 - numero2;
                System.out.println("A subtração dos dois numeros é: " + subtracao);
                break;
            }

            case 3 : {
                Scanner scanner = new Scanner(System.in);
                System.out.println("MULTIPLICANDO DOIS NUMEROS:");
                System.out.print("  Digite o primeiro numero:");
                int numero1 = scanner.nextInt();
                System.out.print("Digite o segundo numero:");
                int numero2 = scanner.nextInt();

                int multiplicacao = numero1 * numero2;
                System.out.println("A multiplicação dos dois numeros é: " + multiplicacao);
                break;
            }
           case 4 : {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Dividindo dois numeros");
            System.out.print("Digite o primeiro numero:");
            double numero1 = scanner.nextInt();
            System.out.print("Digite o segundo numero:");
            double numero2 = scanner.nextInt();
            if (numero2 == 0) {
                System.out.println("Impossivel dividir por 0 ");
            } else{
            double divisao = numero1 / numero2;
            System.out.println("A divisão dos dois numeros é:  " + divisao);
            break;
           }
        }
    }
    }
}

    

