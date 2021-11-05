import java.util.Scanner;

public class Estado_llenado_matriz {
  
    public static void main(String[] args) {

        int resultado_filas;
        int resultado_columna;

        Matriz_Recursividad mi_matriz = new Matriz_Recursividad();
 
        int[][] matriz = mi_matriz.llenado_arrays(0, 0, 3, 5);

        System.out.println("***********resultado matriz generada en pantalla***********");
        mi_matriz.resultante_matriz(0, 0, 3, 5);

   
    }
    


}