package FieldExampleV1;

public class Person {
    public String name;
    public int age;
    public String gender;
    public String job;

    public void sleep() {
        System.out.printf("%s가 잠을 잡니다.. zzZ zzZ", name);
    }

    public void doWork() {
        System.out.printf("%s가 일을 합니다.", name);
    }
}
