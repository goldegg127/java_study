package homework01;

public class Designer extends Company{
	
	Step step = new Step(); // 포함관계
	
	String mainSkill;	// 변수 주력기술 - 요구사항 3. 디자이너는 주력기술 속성을 가진다.
	
	Designer(String name, String mainSkill, int age){ // 파라미터가 있는 생성자 선언, 인스턴스 변수 초기화
		this.name = name;
		this.mainSkill = mainSkill;
//		this.age = age; // this.age가 private라는 오류가 뜬다. why....?
	}
	
	void working(){
		
		// 요구사항 4. 디자이너는 일을 할 수 있어야 한다.
		System.out.println( name + " 님이 " + mainSkill + "(을/를) 이용하여 디자인을 합니다." );
	}
	
}
