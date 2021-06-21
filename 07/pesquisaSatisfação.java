import java.util.Scanner;

public class pesquisaSatisfação {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float pessimo = 0;
        float ruim = 0;
        float bom = 0;
        float otimo = 0;
        float total = 0;
        int opiniao = 0;

        System.out.println("Para encerrar, informe um valor fora do intervalo pedido.");
        while (0 <= opiniao && opiniao <= 100) {
            System.out.println("Avalie nosso serviço com uma nota de 0 a 100: ");
            opiniao = keyboard.nextInt();

            if (0 <= opiniao && opiniao <= 25) {
                ++pessimo;
                ++total;
            }
            else if (25 <= opiniao && opiniao <= 50) {
                ++ ruim;
                ++total;
            }
            else if (50 <= opiniao && opiniao <= 75) {
                ++ bom;
                ++total;
            }
            else if (75 <= opiniao && opiniao <= 100) {
                ++ otimo;
                ++total;
            }
        }

        keyboard.close();

        System.out.println("\n--------- RESULTADOS ---------");
        System.out.println(String.format("%.2f porcento dos funcionários consideram as refeições péssimas", (pessimo * 100)/total));
        System.out.println(String.format("%.2f porcento dos funcionários consideram as refeições ruins", (ruim * 100)/total));
        System.out.println(String.format("%.2f porcento dos funcionários consideram as refeições boas", (bom * 100)/total));
        System.out.println(String.format("%.2f porcento dos funcionários consideram as refeições ótimas", (otimo * 100)/total));
    }
}
