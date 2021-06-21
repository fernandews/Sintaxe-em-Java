import java.util.Scanner; 

public class Negativos {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Informe a quantidade de números: ");
        int n = keyboard.nextInt();
        
        int[] negativos = new int[n];
        int count = 0;

        for(int i = 0; i < n; ++i) {
            System.out.print("Informe o número: ");
            int input = keyboard.nextInt();
            if (input < 0) {
                negativos[count] = input;
                ++count;
            }
        }

        System.out.print("\nNegativos: ");
        for(int i = 0; i < count; ++i) {
            System.out.print(negativos[i]);
            System.out.print(" ");
        }

        keyboard.close();
    }
}