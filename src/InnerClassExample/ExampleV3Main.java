package InnerClassExample;

public class ExampleV3Main {
    public static void main(String[] args) {
        InnerClassExample03.StaticInClass staticClass = new InnerClassExample03.StaticInClass();
        staticClass.test();

        InnerClassExample03.StaticInClass.staticTestMethod();
    }
}
