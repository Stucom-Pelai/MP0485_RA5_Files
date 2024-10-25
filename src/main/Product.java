package main;

public class Product {
	private float price;
	private String name;
	private String description;
	
	
	public Product(float price, String name, String description) {
		super();
		this.price = price;
		this.name = name;
		this.description = description;
	}
	
	
	
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}



	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}



	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}



	public String toString() {
		return "\n[Nombre]: "+this.name+"; "+"[Precio]: "+this.price+"; "+"[Descripcion]: "+this.description+"\n";	
	}
}
