package application;

import entities.Reserva;

import java.util.Locale;
import java.util.Scanner;

public class Progam {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Reserva [] vect = new Reserva[10];

        System.out.println("Quantos assentos gostaria de reservar? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println();
            System.out.println("Reserva # " + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Assento escolhido: ");
            int assentNumero = sc.nextInt();

            vect[assentNumero] = new Reserva(nome, email);

        }
        System.out.println();
        System.out.println("Assentos ocupados: ");

        for (int i=0; i<10; i++){
            if (vect[i] != null){
                System.out.println(i + ":" + vect[i]);

            }

        }



        sc.close();
    }
}
