package com.xworkz.market;

public class MarketData {

		private String name;
		private String location;
		

		
		public MarketData(String name, String location) {
			super();
			this.name = name;
			this.location = location;
		}

		

		public void show() {
			System.out.println("name:" + this.name);
			System.out.println("location:" + this.location);
			
		}

	}


