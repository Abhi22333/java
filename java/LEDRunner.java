class LEDRunner {
    public static void main(String[] args) {
        System.out.println("Start main in LEDRunner");

        LED led1 = new LED("red", 800.0, 25000);
        LED led2 = new LED("green", 600.0, 30000);
        LED led3 = new LED("blue", 700.0, 20000);
        LED led4 = new LED("white", 900.0, 40000);
        LED led5 = new LED("yellow", 500.0, 15000);
        LED led6 = new LED("pink", 650.0, 22000);
        LED led7 = new LED("orange", 550.0, 18000);
        LED led8 = new LED("purple", 720.0, 21000);
        LED led9 = new LED("cyan", 750.0, 27000);
        LED led10 = new LED("warm white", 850.0, 35000);
        LED led11 = new LED("cool white", 880.0, 26000);

        System.out.println("LED 1 color: " + led1.color);
        System.out.println("LED 1 brightness: " + led1.brightness);
        System.out.println("LED 1 lifespan: " + led1.lifespan);

        System.out.println("LED 2 color: " + led2.color);
        System.out.println("LED 2 brightness: " + led2.brightness);
        System.out.println("LED 2 lifespan: " + led2.lifespan);

        System.out.println("LED 3 color: " + led3.color);
        System.out.println("LED 3 brightness: " + led3.brightness);
        System.out.println("LED 3 lifespan: " + led3.lifespan);

        System.out.println("LED 4 color: " + led4.color);
        System.out.println("LED 4 brightness: " + led4.brightness);
        System.out.println("LED 4 lifespan: " + led4.lifespan);

        System.out.println("LED 5 color: " + led5.color);
        System.out.println("LED 5 brightness: " + led5.brightness);
        System.out.println("LED 5 lifespan: " + led5.lifespan);

        System.out.println("LED 6 color: " + led6.color);
        System.out.println("LED 6 brightness: " + led6.brightness);
        System.out.println("LED 6 lifespan: " + led6.lifespan);

        System.out.println("LED 7 color: " + led7.color);
        System.out.println("LED 7 brightness: " + led7.brightness);
        System.out.println("LED 7 lifespan: " + led7.lifespan);

        System.out.println("LED 8 color: " + led8.color);
        System.out.println("LED 8 brightness: " + led8.brightness);
        System.out.println("LED 8 lifespan: " + led8.lifespan);

        System.out.println("LED 9 color: " + led9.color);
        System.out.println("LED 9 brightness: " + led9.brightness);
        System.out.println("LED 9 lifespan: " + led9.lifespan);

        System.out.println("LED 10 color: " + led10.color);
        System.out.println("LED 10 brightness: " + led10.brightness);
        System.out.println("LED 10 lifespan: " + led10.lifespan);

        System.out.println("LED 11 color: " + led11.color);
        System.out.println("LED 11 brightness: " + led11.brightness);
        System.out.println("LED 11 lifespan: " + led11.lifespan);

        System.out.println("end main in LEDRunner");
    }
}