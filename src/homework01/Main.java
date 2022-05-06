package homework01;

public class Main {
	
	public static void main(String[] args) {
		
		Company company = new Company();
		
		company.name = "티사이언티픽";
		
		// 요구사항 1. 디자이너와 개발자 2종류의 직군이 있다.
		
		company.job = new String[2];
		company.job[0] = "디자이너";
		company.job[1] = "개발자";
		
		
		// 요구사항 7. 회사는 직원을 신규로 등록할 수 있다. 개발자2명, 디자이너 2
		company.stepNum = Company.stepCnt(30, 4); // 참조변수 company.메서드명()으로 호출하려니까 대문자로 바꾸라고 경고한다. 이 경우는 생성자.메서드명()로 호출하나 보다. 
		
		// 요구사항 9. 회사는 직원을 선택하여 일을 시킬 수 있다.
		company.working();
		
		
		Company newDesigner1 = new Designer("김다현", "피그마", 26); // 조상 타입의 참조변수로 자손 인스턴스 생성하기
		newDesigner1.working();
		
		Company newDeveloper1 = new Developer("김금란", "자바스크립트", 32); // 조상 타입의 참조변수로 자손 인스턴스 생성하기
		newDeveloper1.working();
		
		
		Company newDesigner2 = new Designer("박세림", "포토샵", 21); // 조상 타입의 참조변수로 자손 인스턴스 생성하기
		newDesigner2.working();
		
		Company newDeveloper2 = new Developer("이화섭", "자바", 30); // 조상 타입의 참조변수로 자손 인스턴스 생성하기
		newDeveloper2.working();
		
		company.working();
		
	}
}