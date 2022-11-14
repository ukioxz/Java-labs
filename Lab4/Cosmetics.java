
public class Cosmetics {
	private String brand;
	private String color;
	private String name;
	private int price;
	private double weight;

	public Cosmetics(String brand, String color, String name, int price, double weight) {
		this.brand = brand;
		this.color = color;
		this.name = name;
		this.price = price;
		this.weight = weight;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
