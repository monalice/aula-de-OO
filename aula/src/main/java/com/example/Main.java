package aula.src.main.java.com.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu telefone: ");
        String phone = teclado.nextLine();
        boolean matcherPhone = phone.matcher("^\([0-9]{2}\)\s*[0-9]{4,5}-[0-9]{4}$");
        
        if (matchFoundCellphone){
            System.out.println("celular: " + phone);
        } else if (matchFoundPhone){
            System.out.println("telefone: " + phone);
        } else {
            System.out.println("Falhamos na missão");
        }
    }
}