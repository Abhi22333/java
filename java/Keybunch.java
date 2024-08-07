class Keybunch {
     String material;
     Key key;

    public Keybunch(String material, Key key) {
        this.material = material;
        this.key = key;
    }

    public void details() {
       this.key.details();
		System.out.println("material:"+this.material);
    }
}