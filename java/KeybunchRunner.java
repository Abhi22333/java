class KeybunchRunner {
    public static void main(String[] args) {
        Key key = new Key( "Yale",100.5);
        Keybunch keybunch = new Keybunch("Metal", key);
        keybunch.details();
		
		Key key1 = new Key( "Europa",96.5);
        Keybunch keybunch1 = new Keybunch("Metal", key1);
        keybunch1.details();
    }   
}