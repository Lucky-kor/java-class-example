package FieldExampleV1;

public class FieldExampleV1 {
    int instanceVariable; // 인스턴스 변수
    static int classVariable; // 클래스 변수(static 변수, 공유변수)

    void method() { // => 메서드 영역
        int localVariable = 0; // 지역 변수. {}블록 안에서만 유효
    }
}
