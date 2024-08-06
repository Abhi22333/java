class Paper {
    double thickness;
    int size;
    String quality;
    String color;
    String material = "Wood "; 

    public Paper(double thickness) {
        this.thickness = thickness;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Thickness: " + thickness + " mm");
        System.out.println("Size: " + size + " inches");
        System.out.println("Quality: " + quality);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println();
    }
}
