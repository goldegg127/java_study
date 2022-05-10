package homework;

public class TeamMember extends RndCenter {

	/**
	 *TODO: 필드는 private으로 외부 적근을 막고, getter, setter를 통해 접근하도록 하는게 좋습니다.
	 */

 	String name;
	String position;
	String job;

	void purpormance(String project) {
		super.purpormance();
		System.out.println(name + position + "는 " + project + " 프로젝트에서 " + job + " 업무를 수행한다.");
	}
	
}
