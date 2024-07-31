class Gold {
    String type;
    double weight;
    double purity;

    
    Gold(String typeLocal, double weightLocal, double purityLocal) {
        type = typeLocal;
        weight = weightLocal;
        purity = purityLocal;
		System.out.println("Created Gold using type,weight,purity");
    }
}