import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        float r = (float) keyboard.nextInt();

        System.out.print("Informe o segundo número: ");
        float s = (float) keyboard.nextInt();

        System.out.print("Informe o terceiro número: ");
        float t = (float) keyboard.nextInt();

        if (r >= s && r >= t) {
            System.out.print("O maior número é: ");
            System.out.println(r);
        }
        else if (s >= r && s >= t) {
            System.out.print("O maior número é: ");
            System.out.println(s);
        }
        else if (t >= r && t >= s) {
            System.out.print("O maior número é: ");
            System.out.println(t);
        }
        keyboard.close();
    }
}
