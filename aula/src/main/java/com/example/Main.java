package com.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu telefone: ");
        String phone = teclado.nextLine();
        boolean matcherPhone = phone.matches("^\\([0-9]{2}\\)\\s*[0-9]{4,5}-[0-9]{4}$");
        
        if (matcherPhone){
            System.out.println("funcionou: " + phone.substring(0, 4));
        } else {
            System.out.println("Falhamos na missão");
        };

        teclado.close();
    }
}