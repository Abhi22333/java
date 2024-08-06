class ChocolateRunner {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate(20);
        chocolate.setSize(23);
        chocolate.flavor = "Strawberry";
        chocolate.display();
		
		Chocolate chocolate1 = new Chocolate(25);
        chocolate.setSize(5);
        chocolate.flavor = "Chocolatew";
        chocolate.display();
		
		Chocolate chocolate2 = new Chocolate(30);
        chocolate.setSize(34);
        chocolate.flavor = "vanilla";
        chocolate.display();
    }
}
