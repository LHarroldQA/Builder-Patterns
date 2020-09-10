
public class Runner {

	public static void main(String[] args) {
		Trainee test = new TraineeBuilder().buildName("Liam").buildAge(21).buildTech("Java").buildTrainee();
		
		System.out.println(test);
		
		Trainee test2 = new TraineeBuilder().buildAge(21).buildTrainee();
		System.out.println(test2);
		test2.setName("Henry");
		System.out.println(test2);
		
		Trainee test3 = new TraineeBuilder().buildTrainee();
		
		test3.setAge(55);
		test3.setName("nick");
		test3.setTech("python");
		System.out.println(test3);
	}
}
