package ConstructorExample;

class CarV2 {
    public String model;
    public String color;

    public CarV2(String model, String color) { // 매개변수가 있는 생성자
        this.model = model;
        this.color = color;
    }

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
