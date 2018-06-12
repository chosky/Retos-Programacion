/**
 * @Author: Chosky
 */

import java.util.*;

class NQueens{

    public static int[] tablero;
    public static int soluciones = 0;

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Ingrese la cantidad de reinas:");
	int n = in.nextInt();
	tablero = new int[n];
	ubicarReina(0, n);
	System.out.println("Posivilidades para " + n + " reinas: " + soluciones);
    }

    //Siendo x1 = i->posicion(fila) y y1 = tablero[i]->contenido(columna)
    //Siendo x2 = reina(fila) y y2 = columna
    public static boolean sePuedeUbicar(int x2, int y2){
	for(int i = 0; i < x2; ++i){
	    if(tablero[i] == y2 || Math.abs(i - x2) == Math.abs(y2 - tablero[i])) return false;
	}
	return true;
    }

    //Siendo n el tamaño del tablero
    public static void ubicarReina(int x1, int n){
	for(int i = 0; i < n; ++i){
	    if(sePuedeUbicar(x1, i)){
		tablero[x1] = i;
		if(x1 == n - 1) ++soluciones;
		else ubicarReina(x1 + 1, n);
	    }
	}
    }

}
