package company;

import company.object.Designer;
import company.object.Developer;
import company.object.Step;

public class Main {
	public static void main(String[] args) {
		
		Company company = new Company();
		
		// 회사가 디자이너와 개발자를 고용해서 등록한다.
		// 직원의 수가 증가한다.
		
		Step devStep = new Developer("김금란", 32, "자바스크립트");
		company.register(devStep.name);
		
		Step designStep = new Designer("김다현", 26, "피그마");
		company.register(designStep.name);
		
		// 직원들이 각자 일을 한다.
		devStep.working();
		
	}
}
