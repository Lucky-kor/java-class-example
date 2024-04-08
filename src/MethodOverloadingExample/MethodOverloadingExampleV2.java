package MethodOverloadingExample;

public class MethodOverloadingExampleV2 {
    public int add(int a, int b) {
        return a + b;
    }

    // 세 정수의 합을 계산하는 메서드
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 가변 인자(Variable Arguments) 사용
    public int add(int ...numbers) {
        int sum = 0;
        for(int number: numbers) {
            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {
        MethodOverloadingExampleV2 methodOverloadingExampleV2 = new MethodOverloadingExampleV2();
        System.out.println(methodOverloadingExampleV2.add(1, 2));
        System.out.println(methodOverloadingExampleV2.add(1, 2, 3, 4, 5, 6));
    }
}
