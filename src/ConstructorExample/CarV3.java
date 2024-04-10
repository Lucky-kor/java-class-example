package ConstructorExample;

class CarV3 {
    public String model;
    public String color;
    public int fuel;

    public CarV3(){} // 기본생성자. 생성자가 없는 경우 자동 생성

    public CarV3(String model, String color) { // 매개변수가 있는 생성자
        this.model = model;
        this.color = color;
    }

    public CarV3(String model, String color, int fuel) {
        this.model = model;
        this.color = color;
        this.fuel = fuel;
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
