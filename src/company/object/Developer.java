package company.object;

public class Developer extends Step {
	
	public Developer(String name, int age, String ability){
		super.name = name;
		super.age = age;
		lang = ability;
		position = "개발자";
	}

	public String lang;
	public String position;

	public void working() {
		System.out.println(position + super.name + "님은 " + lang + "로 코딩을 합니다.");
	}
}
