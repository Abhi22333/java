class Ant{
	
	public static void battery(){
		String power = "The batery percentage is 60";
		String capacity = "The battery can hold its capacit over a long period of time";
		boolean batteryOn = false;
		boolean batteryOff = true;
		System.out.println(power +" "+capacity+" "+batteryOn+" "+batteryOff);
	}
	
	public static void variables(){
		double height = 175.5;
		char alphabet = 'B';
		height = 180.2;
		System.out.println(height + " "+alphabet);
	}
	
	public static void india(){
		String name1 = "Virat Kohli";
		int score1 = 76;
		
		String name2 = "Axar Patel";
		int score2 = 47;
		
		String name3 = "Shivam Dube";
		int score3 = 27;
		
		String name4 = "Keshav Maharaj";
		int score4 = 23;
		
		String name5 = "Anrich";
		int score5 = 26;
		
		System.out.println(name1 + score1 +" "+name2 + score2+" "+name3+score3+" "+name4+score4+" "+name5+score5);
	}
	
	public static void southAfrica(){
		String name1 = "R.Hendricks";
		int score1 = 4;
		
		String name2 = "de Kock";
		int score2 = 39;
		
		String name3 = "A.Markram";
		int score3 = 4;
		
		String name4 = "T.Stubbs";
		int score4 = 31;
		
		String name5 = "David Miller";
		int score5 = 21;
		
		System.out.println(name1+score1+" "+name2+score2+" "+name3+score3+" "+name4+score4+" "+name5+score5);
	}
	
	public static void main(String[] args){
		battery();
		variables();
		india();
		southAfrica();
	}
	
}