package week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//10���� ���� �Է� �޾�, �� �߿��� Ȧ���� ���� ���� ����ϴ� ���α׷��� �ۼ��϶�.
//
//
//[���� ����]
//
//�� ���� 0 �̻� 10000 ������ �����̴�.
//
//
//[�Է�]
//
//���� ù �ٿ��� �׽�Ʈ ���̽��� ���� T�� �־�����, �� �Ʒ��� �� �׽�Ʈ ���̽��� �־�����.
//
//�� �׽�Ʈ ���̽��� ù ��° �ٿ��� 10���� ���� �־�����.
//
//
//[���]
//
//����� �� ���� '#t'�� �����ϰ�, ������ �� ĭ �� ���� ������ ����Ѵ�.
//
//(t�� �׽�Ʈ ���̽��� ��ȣ�� �ǹ��ϸ� 1���� �����Ѵ�.)
//�Է�
//3
//3 17 1 39 8 41 2 32 99 2
//22 8 5 123 7 2 63 7 3 46
//6 63 2 3 58 76 21 33 8 1   
// 
//���
//#1 200
//#2 208
//#3 121
// 

public class Samsung_2072 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int result = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 10; j++) {
				
				int score = sc.nextInt();
				if( score % 2 != 0)
				result += score;
			}
			System.out.println("#" + (i + 1) + " " + result);
			result = 0;
		}
	}
}
