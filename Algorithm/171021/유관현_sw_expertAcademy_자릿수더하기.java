package week5;

import java.util.Scanner;

//�ϳ��� �ڿ����� �Է� �޾� �� �ڸ����� ���� ����ϴ� ���α׷��� �ۼ��϶�.
//[���� ����]
//�ڿ��� N�� 1���� 9999������ �ڿ����̴�. (1 �� N �� 9999)
//[�Է�]
//�Է����� �ڿ��� N�� �־�����.
//[���]
//�� �ڸ����� ���� ����Ѵ�.
//�Է�
//6789
//���
//30

public class Samsung_2058 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String inputValue = sc.nextLine();
		char[] charArr = inputValue.toCharArray();
		int result =0;
		for(int i=0; i<charArr.length; i++) {
			result += Character.getNumericValue(charArr[i]);
		}
		System.out.println(result);
	}
}
