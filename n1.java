package week1;
import java.util.*;
public class n1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		//첫번째 수와 두번째 수를 입력받는다.
		
		int a = B%10; //일의자리 숫자
		int b = (B%100)/10;	//십의자리 숫자
		int c = B/100;	//백의 자리 숫자
		
		System.out.println(A*a);//...(3)
		System.out.println(A*b);//...(4)
		System.out.println(A*c);//...(5)
		
		System.out.println(A*B);
		

	}

}
