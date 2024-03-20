package java_kadai;

import java.util.Scanner;

public class kadai1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("一つ目の値を入力してください");
		Scanner num_1 = new Scanner (System.in);
		int num1 = num_1.nextInt();
		
		System.out.println("二つ目の値を入力してください");		
		Scanner num_2 = new Scanner (System.in);		
		int num2 = num_2.nextInt();
				
		int total = num1 + num2;	
		int average = total /  2;
		
		System.out.println("合計：" + total);
		System.out.println("平均：" + average);
		}

}
