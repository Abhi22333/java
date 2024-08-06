class Rocket {
    String country;
    double speed;
    double fuelCapacity;
    int noOfThrusters;
    String rocketType = "Space Rocket";

    public Rocket(String country) {
        this.country = country;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    

    public void display() {
        System.out.println("Country: " + country);
        System.out.println("Speed: " + speed );
        System.out.println("Fuel Capacity: " + fuelCapacity );
        System.out.println("Number of Thrusters: " + noOfThrusters);
        System.out.println("Rocket Type: " + rocketType);
        
    }
}
