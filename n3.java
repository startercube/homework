package week1;
import java.util.*;
public class n3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int	Hour = sc.nextInt();
		int Minute = sc.nextInt();
		//45분보다 클 때와 아닐 때로 구분하여 풀이
		if((Minute-45)<0) {
			Minute = Minute+15;
			if((Hour-1)<0) {
				Hour =23;
			}
			else {
				Hour = Hour-1;
			}
			}
		else {
			Minute = Minute-45;
		}
		System.out.println(Hour+" "+Minute);
	}

}
