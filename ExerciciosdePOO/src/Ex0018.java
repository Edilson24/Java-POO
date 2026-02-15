import java.util.Scanner;
/*
Edilson Vitorino Hilário
8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas
trabalhadas no mês. Calcule e mostre o total do seu salário no referidomês.*/

public class Ex0018 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int renda, horas, salarioDia;

        System.out.print("Quanto vc ganha por hora: ");
        renda = input.nextInt();

        System.out.print("Quantas horas vc trabalha no mês: ");
        horas = input.nextInt();

        salarioDia = horas * renda;
        System.out.printf("Seu salario equivale a %d por mês!", salarioDia);
    }
}
