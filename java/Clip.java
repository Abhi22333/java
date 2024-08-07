class Clip {
    private String color;
    private String type;

    public Clip(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public void details() {
        System.out.println("clip color:"+color);
	    System.out.println("clip type:"+type);
    }
}