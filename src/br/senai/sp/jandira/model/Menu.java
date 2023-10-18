package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {


    Scanner scanner = new Scanner(System.in);

    public void Menu() {
        System.out.println("Escolha qual você deseja cadastrar: ");
        System.out.println("1 - Retângulo / 2 - Círculo");
        int opcao = scanner.nextInt();

        switch (opcao){

            case 1:
                opcao = 1;
                System.out.println("Você escolheu retangulo!");
                System.out.println("Informe o comprimento do retângulo: ");
                double comprimento = scanner.nextDouble();
                System.out.println("Informe a largura do retângulo: ");
                double largura = scanner.nextDouble();
                Retangulo retangulo = new Retangulo(comprimento, largura);
                System.out.println("A área é " + retangulo.calcularArea());
                System.out.println("O perímetro é " + retangulo.calcularPerimetro());

        }
        opcao = 2;
        System.out.println("A forma escolhida foi o CÍRCULO");
        System.out.println("Informe o raio do círculo: ");
        double raio = scanner.nextDouble();
        scanner.nextLine();
        Circulo circulo = new Circulo(raio);
        System.out.println("A área do círculo é: " + circulo.calcularArea());
        System.out.println("O perímetro é: " + circulo.calcularPerimetro());


    }
}
