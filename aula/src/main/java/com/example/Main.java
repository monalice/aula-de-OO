package aula.src.main.java.com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pattern patternCellphone = Pattern.compile("([0-9]{2})[0-9]{4}-[0-9]{4}");
        Pattern patternPhone = Pattern.compile("([0-9]{2})[0-9]{5}-[0-9]{4}");

        System.out.println("Digite o seu telefone: ");
        String phone = teclado.nextLine();
        Matcher matcherCellphone = patternCellphone.matcher(phone);
        Matcher matcherPhone = patternPhone.matcher(phone);

        boolean matchFoundCellphone = matcherCellphone.find();
        boolean matchFoundPhone = matcherPhone.find();
        if (matchFoundCellphone){
            System.out.println("celular: " + phone);
        } else if (matchFoundPhone){
            System.out.println("telefone: " + phone);
        } else {
            System.out.println("Falhamos na missão");
        }
    }
}