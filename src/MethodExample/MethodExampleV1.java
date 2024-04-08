package MethodExample;

public class MethodExampleV1 {
    /**
     * 자바제어자 반환타입 메서드명(매개 변수) { -> 메서드 시그니처
     *     메서드 내용(메서드 호출시 실행되는 코드) -> 메서드 바디
     * }
     */

    int getNumSeven() { // 매개변수가 없는 메서드
        return 7;
    }

    Double multiply(int x, double y) { // 매개변수가 있는 메서드
        double result = x * y;
        return result;
    }

    void printString() {
        System.out.println("글을 출력합니다.");
    }

    void printParameterString(String str) {
        System.out.println(str);
    }
}
