package week1;
import java.util.*;
public class test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		
		
		int count = 0;
		int R =0;//������
		int[] t = {1,1,1,1,1,1,1,1};//2
		
		while(true) {
		//a�� 2�� ������ �������� 2���� ũ�� �� ������
			if (a>=2) {
		
				R=a%2;
				if(R==0) {
					R=1;
					
				}
				else {
					R=0;
					
				}
				t[count] = R;
				count += 1;
				a=a/2;
				
			
			}
			else {                  //a�� 1�ϋ�
				R=0;
				t[count] = R;
				count += 1;
				break;
			
			}
			
	}
		for(int i=7;i>-1;i--) {
			
			System.out.print(t[i]);
			}
	

	}

}
