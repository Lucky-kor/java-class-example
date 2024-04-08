package ClassExampleV2;

public class Main {
    public static void main(String[] args) {
        Person jungmin = new Person();
        jungmin.name = "jungmin";
        jungmin.age = 30;
        jungmin.gender = "male";
        jungmin.job = "Developer";

        Person coding = new Person();
        coding.name = "coding";
        coding.age = 22;
        coding.gender = "female";
        coding.job = "Student";

        System.out.println(jungmin);
        System.out.println(coding);

        jungmin.sleep();
    }
}
