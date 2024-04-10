package ConstructorExample;

class Car {
    public String model;
    public String color;

    void power() {
        System.out.println("시동을 걸었습니다.");
    }

    void accelerate() {
        System.out.println("더 빠르게!");
    }

    void stop(){
        System.out.println("멈춤");
    }
}
