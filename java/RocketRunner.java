class RocketRunner {
    public static void main(String[] values) {
        Rocket rocket = new Rocket("INDIA");
        rocket.speed = 1000;
        rocket.fuelCapacity = 10000;
        rocket.noOfThrusters = 4;
        rocket.display();

        Rocket rocket1 = new Rocket("Russia");
        rocket1.speed = 1200;
        rocket1.fuelCapacity = 12000;
        rocket1.noOfThrusters = 6;
        rocket1.display();

        Rocket rocket2 = new Rocket("USA");
        rocket2.speed = 1500;
        rocket2.fuelCapacity = 15000;
        rocket2.noOfThrusters = 8;
        rocket2.display();
    }
}
