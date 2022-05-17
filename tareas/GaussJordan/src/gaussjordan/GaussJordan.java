
import java.util.Scanner;

public class GaussJordan {

    static final int MAXN = 20;
    static double a[][] = new double[MAXN][MAXN];
    static int num;

    public static void main(String[] args) {
        System.out.println("Ingrese el número de incógnitas:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Ingrese un sistema de ecuaciones lineales representado por una matriz:");
        for (int i = 0; i < num; i++) {// Ingresa las ecuaciones
            for (int j = 0; j <= num; j++) {
                a[i][j] = sc.nextDouble();
            }
        }

        for (int j = 0; j < num - 1; j++) {
            guiyi(j);
            dengjia(j);
            guiling(j + 1);
        }
        guiyi(num - 1);
        for (int i = 0; i < num; i++) {
            System.out.println("x" + i + "=" + a[i][num]);
        }
    }

    static void dengjia(int jj) {// Convierte la matriz original en un triángulo
        for (int i = jj + 1; i < num; i++) {
            double k = a[i][jj] / a[jj][jj];
            for (int j = jj; j <= num; j++) {
                a[i][j] = a[i][j] - a[jj][j] * k;
            }
        }
    }

    static void guiyi(int jj) {// Haz que akk se convierta en 1
        for (int i = num; i >= 0; i--) {
            a[jj][i] = a[jj][i] / a[jj][jj];
        }
    }

    static void guiling(int jj) {// Hacer otros valores 0
        for (int i = 0; i < jj; i++) {
            double k = (-a[i][jj]) / a[jj][jj];
            for (int j = jj; j <= num; j++) {
                a[i][j] += a[jj][j] * k;
            }
        }

    }
}
