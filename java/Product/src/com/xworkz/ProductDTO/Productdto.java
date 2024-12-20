package com.xworkz.ProductDTO;

public class Productdto {

	private int id;
	private String name;
	private String vendor;
	private double cost;

	public Productdto(int id, String name, String vendor, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.vendor = vendor;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getVendor() {
		return vendor;
	}

	public double getCost() {
		return cost;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((vendor == null) ? 0 : vendor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Productdto other = (Productdto) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (vendor == null) {
			if (other.vendor != null)
				return false;
		} else if (!vendor.equals(other.vendor))
			return false;
		return true;
	}

}
