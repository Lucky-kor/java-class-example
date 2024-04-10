package InnerClassExample;

public class ExampleV2Main {
    public static void main(String[] args) {
        InnerClassExample02 outer = new InnerClassExample02();
        System.out.println("외부 클래스 사용하여 내부 클래스 기능 호출");
        outer.testClass();
    }
}
