import java.util.Scanner;

public class OlaMundoDojo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro número da soma");
        int valor1 = entrada.nextInt();

        System.out.println("Informe o segundo número da soma");
        int valor2 = entrada.nextInt();

        System.out.println("Informe o terceiro número da soma");
        int valor3 = entrada.nextInt();

        int soma = valor1 + valor2 + valor3;

        System.out.println("A soma dos três números é " + soma);


        entrada.close();


    }
}
