package week1;
import java.util.*;
public class n1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		//ù��° ���� �ι�° ���� �Է¹޴´�.
		
		int a = B%10; //�����ڸ� ����
		int b = (B%100)/10;	//�����ڸ� ����
		int c = B/100;	//���� �ڸ� ����
		
		System.out.println(A*a);//...(3)
		System.out.println(A*b);//...(4)
		System.out.println(A*c);//...(5)
		
		System.out.println(A*B);
		

	}

}
