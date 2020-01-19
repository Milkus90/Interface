package pl.basics.learning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication();
        }
        else {
            computation = new Addition();
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Jakie dzialanie wykonac? \n1.Mnozenie\n2.Dodawanie");
        Scanner scan = new Scanner(System.in);
        if(scan.nextInt() == 1){
            return true;
        }else return false;
    }

    private double getArgument() {
        System.out.println("Podaj argument dzialania: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
}
