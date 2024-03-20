package Phone;

public class telephone {
	protected String email;
	protected String tele_number;

	public telephone() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public void explain() {
		System.out.println(this.tele_number +"から電話をかけます。");
		System.out.println(this.email + "からメールを送信します。");
	}
	
	public void setTele_number(String tele_number) {
		this.tele_number = tele_number;
	}
	
	public String getTele_number() {
		return tele_number;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
}
