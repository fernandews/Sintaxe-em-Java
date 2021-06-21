public class ImprimeFibonacci {
    public static void main(String[] args) {
        int primeiro = 0;
        int segundo = 1;
        int atual = 0;

        System.out.println("Os primeiros valores de Fibonacci são: ");
        System.out.print(primeiro);
        System.out.print(" ");
        System.out.print(segundo);
        System.out.print(" ");

        while (atual <= 100) {
            atual = primeiro + segundo;
            primeiro = segundo;
            segundo = atual;

            System.out.print(atual);
            System.out.print(" ");
        }

        System.out.println(" ");
    }
}
