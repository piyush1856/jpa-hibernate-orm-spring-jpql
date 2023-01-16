package com.masai.model;

public class ProductDTO {
	
	private String name;
	private Integer puantity;
	private Double price;
	
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(String name, Integer puantity, Double price) {
		super();
		this.name = name;
		this.puantity = puantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPuantity() {
		return puantity;
	}

	public void setPuantity(Integer puantity) {
		this.puantity = puantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductDTO [name=" + name + ", puantity=" + puantity + ", price=" + price + "]";
	}

}
