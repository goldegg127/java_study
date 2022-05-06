package company.object;

public class Designer extends Step {
	
	public Designer(String name, int age, String abillty){
		super.name = name;
		super.age = age;
		skill = abillty;
		position = "디자이너";
	}
	
	public String skill;
	public String position;

	public void working() {
		System.out.println(position + super.name + "님은 " + skill + "을 사용하여 디자인을 합니다.");
	}
}
