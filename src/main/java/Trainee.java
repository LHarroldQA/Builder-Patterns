
public class Trainee {
	private String name,tech;
	private int age;
	
    // constructors
    public Trainee() {

    }

    public Trainee(String name, int age, String tech) {
        this.name = name;
        this.age = age;
        this.tech = tech;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Trainee [name=" + name + ", tech=" + tech + ", age=" + age + "]";
	}
	
	

}
