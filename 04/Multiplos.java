public class Multiplos {
    public static void main(String[] args) {
        System.out.print("Entre 0 e 100, os múltiplos de 3 são: ");
        for (int i = 0; i < 101; ++i) {
            if (i % 3 == 0) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
