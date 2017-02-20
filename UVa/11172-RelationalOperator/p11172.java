import java.util.Scanner;

class p11172{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int cantidad = sc.nextInt();
	while(cantidad > 0){
	    int first = sc.nextInt(), last = sc.nextInt();
	    if(first < last) System.out.println("<");
	    else if(first > last) System.out.println(">");
	    else System.out.println("=");
	    --cantidad;
        }
	sc.close();
    }
}
