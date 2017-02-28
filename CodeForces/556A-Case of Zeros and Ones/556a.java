import java.util.*;

class Main{

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int cantidad = sc.nextInt();
	String cadena = sc.nextLine();
	int zero = 0, one = 0;

	for(int i = 0; i < cadena.length(); ++i){
	    if(cadena.charAt(i) == '0') ++zero;
	    else ++one;
	}

	System.out.println(Math.abs(zero - one));

	sc.close();

    }
}
