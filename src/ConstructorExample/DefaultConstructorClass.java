package ConstructorExample;

public class DefaultConstructorClass {
    public String name;
    public int number;

    public DefaultConstructorClass() {
        this.name = "Default Class";
        this.number = 0;
    }

    public DefaultConstructorClass(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
