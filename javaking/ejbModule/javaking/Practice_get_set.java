package javaking;

class DTO{
	
 private int age;
 private String name;

public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 
 
	
}

public class Practice_get_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	DTO dto = new DTO();
	
	dto.setAge(29);
	dto.setName("문돌이");	
	
	System.out.println(dto.getName() + "는" + dto.getAge() + "세");
	System.out.println();
	
	}

}
