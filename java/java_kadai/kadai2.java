package java_kadai;

import java.util.Scanner;

public class kadai2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("身長(m)を入力してください");
		Scanner num_height = new Scanner (System.in);

		double Height = num_height.nextDouble();
		
		System.out.println("体重(kg)を入力してください");		
		Scanner num_weight = new Scanner (System.in);	
		double Weight = num_weight.nextDouble();
		
		double BMI = Weight / (Height * Height);

		if(BMI < 18.5 && BMI > 0) {
			System.out.println("あなたは「やせ」です。");	
		}else if(BMI >= 18.5 && BMI < 25) {
			System.out.println("あなたは「標準」です。");	
		}else if(BMI >= 25 && BMI < 30) {
			System.out.println("あなたは「肥満」です。");	
		}else if(BMI >= 30){
			System.out.println("あなたは「高度肥満」です。");	
		}else {
			System.out.println("正しい数値を入力してください");	
		}

	}
}
//输入的数值如果不是数字的话将无法处理
