package MethodOverloadingExample;

public class MethodOverloadingExampleV1 {
    // 두 정수의 합을 계산하는 메서드
    public int add(int a, int b) {
        return a + b;
    }

    // 세 정수의 합을 계산하는 메서드
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 두 실수의 합을 계산하는 메서드
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingExampleV1 calc = new MethodOverloadingExampleV1();

        System.out.println(calc.add(2, 3)); // 두 정수의 합
        System.out.println(calc.add(2, 3, 4)); // 세 정수의 합
        System.out.println(calc.add(2.5, 3.5)); // 두 실수의 합
    }
}
