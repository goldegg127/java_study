package homework;

public class TeamMember extends RndCenter {
	
	String name;
	String position;
	String job;

	void purpormance(String project) {
		super.purpormance();
		System.out.println(name + position + "는 " + project + " 프로젝트에서 " + job + " 업무를 수행한다.");
	}
	
}
