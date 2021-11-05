import java.util.Scanner;

public class Matriz_Recursividad {

    private int[][] matriz_entera_r = new int[3][5];

    int num1 = 0;
    int num2 = 0;

    public int[][] llenado_arrays(int val1, int val2, int resultado_filas, int resultado_columna) {
        Scanner teclado = new Scanner(System.in);

        if (num1 == 0) {
            if (val1 < resultado_filas) {

                if (val2 < resultado_columna) {

                    System.out.println("************Escriba un numero  de tipo entero:************ " + "["+val1+"]["+val2+"]");
                    matriz_entera_r[val1][val2] = teclado.nextInt(); 

                    llenado_arrays(val1, val2 + 1, resultado_filas, resultado_columna);

                }

                if (val2 == resultado_columna) {

                    llenado_arrays(val1 + 1, 0, resultado_filas, resultado_columna);
                }
            } else {
                System.out.println("************Se ha terminado el llenado de la matriz ************");
                num1 = 1;
            }
        }
        return this.matriz_entera_r;

    }

    public void resultante_matriz(int val1, int val2, int resultado_filas, int resultado_columna) {

        if (num2 == 0) {
            if (val1 < resultado_filas) {

                if (val2 < resultado_columna) {
                    System.out.print(matriz_entera_r[val1][val2]+"|");
                    resultante_matriz(val1, val2 + 1, resultado_filas, resultado_columna);
                }

                if (val2 == resultado_columna) {
                    System.out.println("");
                    resultante_matriz(val1 + 1, 0, resultado_filas, resultado_columna);

                }
            } else {
                num2 = 1;
            }
        }

    }

  

}