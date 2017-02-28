import java.util.*;

class Main{

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int price = sc.nextInt();
	int dolars = sc.nextInt();
	int bananas = sc.nextInt();
	int total = 0;
	int i = 1;
	
	while(i <= bananas){
	    total += price * i;
	    ++i;
	}
	
	if(total-dolars <= 0) System.out.println(0);
	else System.out.println(total-dolars);
        
	sc.close();
    }
}
