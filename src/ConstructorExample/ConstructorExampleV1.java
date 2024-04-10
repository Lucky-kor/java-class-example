package ConstructorExample;

public class ConstructorExampleV1 {
    public static void main(String[] args) {
        Car sonata = new Car();

        System.out.println(sonata.model);
        System.out.println(sonata.color);

        sonata.color = "Black";
        sonata.model = "Sonata";

        System.out.println(sonata.color);
        System.out.println(sonata.model);
    }
}
