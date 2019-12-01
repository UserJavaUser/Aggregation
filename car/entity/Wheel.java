package by.htp.automobile.entity;

public class Wheel {

	private int size;
	private int diameter;
	
	public Wheel() {
		
	}
	
	public Wheel(int size, int diameter) {
		this.size = size;
		this.diameter = diameter;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diameter;
		result = prime * result + size;
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
		Wheel other = (Wheel) obj;
		if (diameter != other.diameter)
			return false;
		if (size != other.size)
			return false;
		return true;
	}
	
}
