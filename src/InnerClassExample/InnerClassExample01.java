package InnerClassExample;

public class InnerClassExample01 {
    class Inner {
        // 인스턴스 내부 클래스
        void print() {
            System.out.println("Print!");
        }
    }

    static class StaticInner {
        // 정적 내부 클래스
        void print() {
            System.out.println("Print!");
        }
    }

    void run() {
        class LocalInner {
            // 지역 내부 클래스
        }
    }
}
