import java.util.Scanner;
public class endereço {
    public static void main (String[] args) {
 System.out.println("---Cadastro de usuario---");
Scanner Dados = new Scanner(System.in);
System.out.print("Digite seu nome completo:");
String nome = Dados.nextLine();

System.out.print("insira sua rua:");
String rua = Dados.nextLine();

System.out.print("insira o numero da casa:");
String numero = Dados.nextLine();

System.out.print("Digite o bairro onde voce mora:");
String bairro = Dados.nextLine();

System.out.print("Digite sua cidade:");
String cidade = Dados.nextLine();

System.out.print("Digite seu estado:");
String estado = Dados.nextLine();

System.out.print("Digite seu CEP:");
String CEP = Dados.nextLine();

System.out.println("nome completo:" + nome);

System.out.println("Endereço" + ", " + numero + ", " + bairro + ", " + cidade + ", " + estado + ",");

System.out.println("CEP:" + CEP);

    }


}
//Gui