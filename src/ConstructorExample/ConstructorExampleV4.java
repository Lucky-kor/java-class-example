package ConstructorExample;

public class ConstructorExampleV4 {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.displayAccount(); // 기본 생성자를 이용한 객체 생성

        Account account2 = new Account("123-45-6789", 1000000);
        account2.displayAccount(); // 매개변수가 있는 생성자를 이용한 객체 생성
    }
}
