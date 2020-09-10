public class TraineeBuilder {
    private String name = "";
    private int age = 0;
    private String tech = "nothing";

    public TraineeBuilder() {

    }

    public Trainee buildTrainee() {
        return new Trainee(name, age, tech);
    }

    public TraineeBuilder buildName(String name) {
        this.name = name;
        return this;
    }

    public TraineeBuilder buildAge(int age) {
        this.age = age;
        return this;
    }

    public TraineeBuilder buildTech(String tech) {
        this.tech= tech;
        return this;
    }
}