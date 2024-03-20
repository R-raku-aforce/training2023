package Phone;

public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		telephone telePhone = new telephone();
		
		telePhone.setTele_number("090-0000-0000");
		telePhone.setEmail("test@a-force.co.jp");	
		
		telePhone.explain();
		
		 Smartphone smartPhone = new Smartphone();
		
		 smartPhone.setTrackNo(1);
		 smartPhone.trackNow(1);
//		 smartPhone.trackNext(0);
//		 smartPhone.trackPre(0);
		 
		 smartPhone.setVolumeUp(6);
		 smartPhone.VolumeUp(6);
		 
		 smartPhone.trackNext(1);
		 
		 smartPhone.setVolumeDown(5);
		 smartPhone.VolumeDown(5);
		 		 	
		 smartPhone.setTele_number("091-1111-1111");
		 smartPhone.setEmail("sample@a-force.co.jp");
		 smartPhone.explain();	
	}
}
