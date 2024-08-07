class Knife {
     double weight;
     double height;

    public Knife(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public void details() {
        System.out.println("Knife Weight: " + weight);
		System.out.println("Knife Height : " + height);
    }
}