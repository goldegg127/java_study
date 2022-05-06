package company;

public interface Operating {
	// 1. 회사는 직원을 신규로 등록
	public void register(String name);
	
	// 2. 회사는 직원 총수를 카운트
	public void count();
	
	// 3. 회사는 직원을 선택하여 일을 시킨다.
	public void working();
}
