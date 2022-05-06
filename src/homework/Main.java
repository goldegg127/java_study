package homework;

public class Main {
	
	public static void main(String[] args) {
		
//		RndCenter rnd = new RndCenter();
		TeamMember rndMember = new TeamMember();
		
		rndMember.team = new String[3];
		rndMember.team[0] = "개발팀";
		rndMember.team[1] = "전산운영팀";
		rndMember.team[2] = "운세팀";
		
		rndMember.name = "김금란";
		rndMember.position = "대리";
		rndMember.job = "프론트엔드 개발";
		

		rndMember.purpormance("예스콘");
	}

}
