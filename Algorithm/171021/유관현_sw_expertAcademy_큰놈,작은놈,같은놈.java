package week5;

//2���� ���� �Է� �޾� ũ�⸦ ���Ͽ� ��ȣ �Ǵ� �ε�ȣ�� ����ϴ� ���α׷��� �ۼ��϶�.
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
//�� �׽�Ʈ ���̽��� ù ��° �ٿ��� 2���� ���� �־�����.
//
//
//[���]
//
//����� �� ���� '#t'�� �����ϰ�, ������ �� ĭ �� ���� ������ ����Ѵ�.
//
//(t�� �׽�Ʈ ���̽��� ��ȣ�� �ǹ��ϸ� 1���� �����Ѵ�.)
// 
//�Է�
//3
//3 8 
//7 7 
//369 123      
// 
//���
//#1 <
//#2 =
//#3 >

import java.util.ArrayList;
import java.util.Scanner;
 
public class Samsung_2070 {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                int score = sc.nextInt();
                al.add(score);
            }
            if (al.get(0) < al.get(1)) {
                System.out.println("#" + (i + 1) + " " + "<");
            } else if (al.get(0) > al.get(1)) {
                System.out.println("#" + (i + 1) + " " + ">");
            } else {
                System.out.println("#" + (i + 1) + " " + "=");
            }
            al.clear();
        }
    }
}
