class Board {
    String material;
    double length;
    double width;

    
    Board(String materialLocal, double lengthLocal, double widthLocal) {
        material = materialLocal;
        length = lengthLocal;
        width = widthLocal;
		System.out.println("Created Gold using material,length,width");
    }
}