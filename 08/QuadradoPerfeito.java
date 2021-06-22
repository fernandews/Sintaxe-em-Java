import java.util.Scanner;

class Matriz {
    private int[][] matriz;
    public int ordem;

    public Matriz (int n) {
        this.matriz = new int[n][n];
        this.ordem = n;
    }

    public void popular (Scanner keyboard) {
        for (int i = 0; i < ordem; ++i) {
            for (int j = 0; j < ordem; ++j) {
                System.out.print(String.format("Informe o elemento na posição [%d][%d]: ", i, j));
                matriz[i][j] = keyboard.nextInt();
            }
        }
    }

    public void imprimir () {
        for (int i = 0; i < ordem; ++i) {
            for (int j = 0; j < ordem; ++j) {
                System.out.print(String.format("[%d]", matriz[i][j]));
            }
            System.out.println(" ");
        }
    }

    public int somaLinha (int linha) {
        int soma = 0;
        for (int i = 0; i < ordem; ++i) {
            soma += matriz[linha][i];
        }

        return soma;
    }

    public int somaColuna (int coluna) {
        int soma = 0;
        for (int i = 0; i < ordem; ++i) {
            soma += matriz[i][coluna];
        }

        return soma;
    }

    public int somaDiagonalPrimaria () {
        int soma = 0;
        for (int i = 0; i < ordem; ++i) {
            soma += matriz[i][i];
        }

        return soma;
    }

    public int somaDiagonalSecundaria () {
        int soma = 0;
        for (int i = 0; i < ordem; ++i) {
            soma += matriz[i][ordem - 1 - i];
        }

        return soma;
    }

    public boolean eQuadradoPerfeito () {
        for (int i = 1; i < ordem; ++i) {
            if (this.somaLinha(i) != this.somaLinha(i - 1)) {
                return false;
            }
        }
        for (int i = 1; i < ordem; ++i) {
            if (this.somaColuna(i) != this.somaColuna(i - 1)) {
                return false;
            }
        }
        if (this.somaDiagonalPrimaria() != this.somaDiagonalSecundaria()) {
            return false;
        }

        return true;
    }
}

public class QuadradoPerfeito {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Informe a ordem da matriz: ");
        int n = keyboard.nextInt();

        Matriz matriz = new Matriz(n);

        System.out.println("\n--------- LENDO A MATRIZ ---------");
        matriz.popular(keyboard);

        System.out.println("\n--------- IMPRIMINDO A MATRIZ ---------");
        matriz.imprimir();

        if (matriz.eQuadradoPerfeito()) {
            System.out.println("A matriz é um quadrado perfeito");
        }
        else {
            System.out.println("A matriz não é um quadrado perfeito");
        }
    }
}
