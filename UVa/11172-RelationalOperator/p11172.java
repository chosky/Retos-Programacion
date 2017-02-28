import java.util.*;
import java.lang.*;

class Main{

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
	long cantidad = sc.nextInt();
	while(cantidad > 0){
	    long first = sc.nextInt();
	    long last = sc.nextInt();
	    if(first < last) System.out.println("<");
	    else if(first > last) System.out.println(">");
	    else System.out.println("=");
	    --cantidad;
        }
	sc.close();
    }
}
