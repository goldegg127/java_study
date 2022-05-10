package homework;

public class RndCenter {

	/**
	 * TODO: 필드는 private으로 외부 적근을 막고, getter, setter를 통해 접근하도록 하는게 좋습니다.
	 *
	 * private String[] team;
	 *
	 * 	public String[] getTeam() {
	 * 		return team;
	 *        }
	 *
	 * 	public void setTeam(String[] team) {
	 * 		this.team = team;
	 *    }
	 */
	private String[] team;

	static String company = "티사이언티픽";
	
	void purpormance() {
		System.out.println( company + "에 도착하여 출근을 하고 컴퓨터 전원을 킨다.");
		System.out.println("R&D 센터를 구성하는 팀은 " + team.length + "팀 이다.");
		
	}
}
