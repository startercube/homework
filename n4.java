package week1;
import java.util.*;
public class n4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int S = sc.nextInt();
		//시, 분, 초 입력
		
		int a = sc.nextInt();//추가할 시간(초)
		/*System.out.println(H+" "+M+" "+S);
		System.out.println(a);*/
		
		int sum = H*60*60 + M*60 + S + a;//모두 초로 바꾸어 합산
		
		int h = (sum/3600)%24;
		int m = (sum%3600)/60;
		int s = sum%60;
		System.out.println(h+" "+m+" "+s);
		

	}

}
