import java.util.Scanner;

public class TrocoNotas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valor;
        int restante;
        int nota100, nota50, nota20, nota10, nota5, nota2, nota1;

        System.out.println("Insira o valor: ");
        System.out.println("---------------------------------");
        valor = ler.nextInt();


        nota100 = valor / 100;
        System.out.println("Notas de 100 = " + nota100);
        restante = valor % 100;

        nota50 = restante / 50;
        System.out.println("Notas de 50 = " + nota50);
        restante = restante % 50;

        nota20 = restante / 20;
        System.out.println("Notas de 20 = " + nota20);
        restante = restante % 20;

        nota10 = restante / 10;
        System.out.println("Notas de 10 = " + nota10);
        restante = restante % 10;

        nota5 = restante / 5;
        System.out.println("Notas de 5 = " + nota5);
        restante = restante % 5;

        nota2 = restante / 2;
        System.out.println("Notas de 2 = " + nota2);
        restante = restante % 2;

        nota1 = restante / 1;
        System.out.println("Notas de 1 = " + nota1);

    }

}
