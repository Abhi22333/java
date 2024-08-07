class AnanyaRunner {
    public static void main(String[] args) {
	Knife knife = new Knife(300.0, 10.5);
        Ananya ananya = new Ananya("1234567890", knife);
		ananya.details();
		
		Knife knife1 = new Knife(295.0, 11.5);
        Ananya ananya1 = new Ananya("1234567880", knife1);
		ananya1.details();
		}
	}