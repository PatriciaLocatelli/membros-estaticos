package teste;

import entidades.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do Raio");
        double raio = sc.nextDouble();

        System.out.println("Circunferência = " + Calculadora.circunferencia(raio));
        System.out.println("Volume = " + Calculadora.volume(raio));
        sc.close();
    }
}
