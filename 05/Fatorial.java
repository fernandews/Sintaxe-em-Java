import java.util.Scanner;

class Calculadora {
    public int calculaFatorial (int x) {
        int fatorial = 1;

        if (x > 0) {
            for (int i = 1; i < x + 1; ++i) {
                fatorial = fatorial * i;
            }
        }
        else {
            System.out.println("Não foi possível realizar o cálculo");
            return -1;
        }

        return fatorial;
    }
}

public class Fatorial {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Informe o número: ");
        int num = keyboard.nextInt();

        Calculadora calcula = new Calculadora();

        System.out.print("O fatorial desse número é: ");
        System.out.println(calcula.calculaFatorial(num));

        keyboard.close();
    }
}
