package homework01;

public class Company {
	
	String name; 
	String[] job;	// 변수 직군 - 요구사항 1. 디자이너와 개발자 2종류의 직군이 있다. 
	static int cnt = 0;
	
	int stepNum; // 변수 직원수 
	
	// 요구사항 8. 회사는 직원 총수를 카운트 할 수 있다.
	static int stepCnt(int stepNum, int newStepNum) {
		return cnt = cnt + newStepNum;
	}
	int stepIncrease() { // 새로운 직원이 생성될 때마다 증가하는 메서드
		return stepNum + 1;
	}
	
	// 요구사항 9. 회사는 직원을 선택하여 일을 시킬 수 있다.
	void working() {
		System.out.println(name + "은 " + stepNum + "명의 직원을 선택하여 일을 시킬 수 있습니다.");
	}
	

}