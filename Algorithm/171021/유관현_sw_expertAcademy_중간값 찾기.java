package week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//�߰����� ��� ������ ��ġ�� ũ�� ������ �迭 ���� �� ��ü�� �߾ӿ� ��ġ�ϴ� ��ġ�� ���Ѵ�.
//
//�Է����� N ���� ������ �־����� ��, �߰����� ����϶�.
//
//
//[����]
//
//N�� 9 �̰�, 9���� ������ �Ʒ��� ���� �־��� ���,
//
//85 72 38 80 69 65 68 96 22
//
//69�� �߰����� �ȴ�.
//
//
//[���� ����]
//
//1. N�� �׻� Ȧ���� �־�����.
//
//2. N�� 9�̻� 199 ������ �����̴�. (9 �� N �� 199)
//
//
//[�Է�]
//
//�Է��� ù �ٿ� N �� �־�����.
//
//��° �ٿ� N ���� ������ �־�����.
//
//
//[���]
//
//N ���� ������ ��, �߰����� �ش��ϴ� ������ �������� ����Ѵ�.

public class Samsung_2063 {

	 public static void main(String[] args) {
         
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        sc.nextLine();
	        ArrayList<Integer> al = new ArrayList<>();
	        for(int i=0; i<N; i++) {
	            int score = sc.nextInt();
	            al.add(score);
	        }
	        Collections.sort(al);
	        System.out.println(al.get((int)(al.size()/2)));
	    }
}
