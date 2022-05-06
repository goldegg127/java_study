package company;

public class Company implements Operating {
	
	static int stepNum;

//	Step step = new Step(); // 포함
	
	
	// 1. 회사는 직원을 신규로 등록
	public void register(String name) {
		System.out.println(name + "님이 고용되었습니다.");
		count();
	};
	
	// 2. 회사는 직원 총수를 카운트
	public void count() {
		stepNum++;
		System.out.println("총 직원 수는 "+ stepNum + "명 입니다.");
	};
	
	// 3. 회사는 직원을 선택하여 일을 시킨다.
	public void working() {
		
	}
}
