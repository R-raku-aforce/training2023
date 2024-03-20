package java_kadai;

public class kadai3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double totalCount = 250000;
		//System.out.println(totalCount);
		double monthlyCount = 30000;
		//System.out.println(monthlyCount);
		double interest_rate = 0.14;
		
		double remainingCount = totalCount;
		
		int i = 1;
		
		while (remainingCount >30000) {
			remainingCount -= monthlyCount;
			remainingCount += (totalCount * interest_rate) / 12;
			
			System.out.println(i + "ヶ月目：返済額＝30000円、残り" + remainingCount + "円");
			i++;
		}
		remainingCount += (totalCount * interest_rate) / 12;			
		System.out.println(i + "ヶ月目：返済額" + remainingCount + "返済完了");		
	}

}
