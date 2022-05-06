package homework01;

public class Developer extends Company {
	
	Step step = new Step(); // 포함관계
	
	String mainLang;	// 변수 주력언어 - 요구사항 5. 개발자는 주력언어 속성을 가진다.
	
	Developer(String name, String mainLang, int age){ // 파라미터가 있는 생성자 함수 선언, 인스턴스 변수 초기화
		this.name = name;
		this.mainLang = mainLang;
		super.stepIncrease();
	}
	
	void working() {
		
		// 요구사항 6. 개발자는 일을 할 수 있어야 한다.
		System.out.println( name + " 님이 " + mainLang + "(을/를) 이용하여 개발을 합니다.");
		
	}
	
}
