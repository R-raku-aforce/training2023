package Phone;

public class Smartphone extends telephone {
	private int trackNo;
	private int volume;
	private int volumeUp;
	private int volumeDown;
	
	public void setVolumeUp(int volumeUp) {
		this.volumeUp = volumeUp;
	}
	public int getVolumeUp() {
		return this.volumeUp;
	}
	
	public void setVolumeDown(int volumeDown) {
		this.volumeDown = volumeDown;
	}
	public int getVolumeDown() {
		return this.volumeDown;
	}
	
	public void setTrackNo(int trackNo) {
		this.trackNo = trackNo;
	}
	public int getTrackNo() {
		return this.trackNo;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getVolume() {
		return this.volume;
	}

	public void trackNow(int trackNo) {
		System.out.println(trackNo + "曲目を再生します。");
	}
	
	public void VolumeUp(int volumeUp) {	
		if(volumeUp >= 5) {
			volume = 10;
			System.out.println( "volumeを" + volumeUp + "上げます。");
			System.out.println( "volumeは" + volume + "です。");
		} else {
			volume = volume + volumeUp;
			System.out.println( "volumeを" + volumeUp + "上げます。");
			System.out.println( "volumeは" + volume + "です。");			
		}		
	}
	
	public void trackNext(int trackNo) {
		System.out.println(trackNo + 1 + "曲目を再生します。");
	}
	public void trackPre(int trackNo) {
		System.out.println(trackNo - 1 + "曲目を再生します。");
	}
	
	
	public void VolumeDown(int volumeDown) {
		if(volumeDown <= volume) {
			volume = volume - volumeDown;
			System.out.println( "volumeを" + volumeDown + "下げます。");
			System.out.println( "volumeは" + volume + "です。");			
		} else {
			volume = 0;
			System.out.println( "volumeを" + volumeDown + "下げます。");
			System.out.println( "volumeは" + volume + "です。");
		}				
	}
		
	@Override	
	public void explain() {
		System.out.println( "音楽を止めます。");	
		System.out.println(this.tele_number +"から電話をかけます。");
		System.out.println(this.email + "からメールを送信します。");
		}
	}
		

