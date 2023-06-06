import java.util.Scanner;

public class LivrariaApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        int nome = sc.nextInt();

        System.out.println("olá" + nome);

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        sc.close();

        Scanner sca = new Scanner(System.in);

        if (idade >= 18) {
            System.out.println("é maior de idade");
        } else
            System.out.println("Menor de idade");

        sca.close();


    }

}