package week1;
import java.util.*;
public class n4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int S = sc.nextInt();
		//��, ��, �� �Է�
		
		int a = sc.nextInt();//�߰��� �ð�(��)
		/*System.out.println(H+" "+M+" "+S);
		System.out.println(a);*/
		
		int sum = H*60*60 + M*60 + S + a;//��� �ʷ� �ٲپ� �ջ�
		
		int h = (sum/3600)%24;
		int m = (sum%3600)/60;
		int s = sum%60;
		System.out.println(h+" "+m+" "+s);
		

	}

}
