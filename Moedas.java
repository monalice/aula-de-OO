import java.util.Scanner;

public class Moedas {
    public static void main(String[] args) {
        int valor, m100, m50, m25, m10, m5, m1;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite um valor em centavos: ");
            valor = teclado.nextInt();
        }

        System.out.println("Moedas: ");

        m100 = valor/100;
        valor %= 100;

        m50 = valor/50;
        valor %= 50;

        m25 = valor/25;
        valor %= 25;
        
        m10 = valor/10;
        valor %= 10;
        
        m5 = valor/5;
        m1 = valor%5;
        
        System.out.println("São necessárias: ");
        System.out.println(m100 + " moedas de 1 real");
        System.out.println(m50 + " moedas de 50 centavos");
        System.out.println(m25 + " moedas de 25 centavos");
        System.out.println(m10 + " moedas de 10 centavos");
        System.out.println(m5 + " moedas de 5 centavos");
        System.out.println(m1 + " moedas de 1 centavo");
        
    }
}