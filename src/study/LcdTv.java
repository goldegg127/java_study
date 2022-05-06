package study;

public class LcdTv extends Tv {
	
	LcdTv(){
		super();
		System.out.println("LCD TV 입니다.");
	}
	
	public void on() {
		super.on();
		System.out.println("LCD TV 2번 채널을 사용합니다.");
	}
	
}
