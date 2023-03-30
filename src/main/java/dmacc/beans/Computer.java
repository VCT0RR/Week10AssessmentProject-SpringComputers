/**
 * @author abhit - aryan9
 * CIS175 - Spring 2023
 * Mar 17, 2023
 */
package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Computer {
	@Id
	@GeneratedValue
	private int id;
	private String brand;
	private String model;
	private String retailPrice;
	@Autowired
	private Details details;
	
	public Computer() {
		// TODO Auto-generated constructor stub
		super();
		this.retailPrice = "$0.00";
	}
	
	public Computer(String brand) {
		// TODO Auto-generated constructor stub
		super();
		this.brand = brand;
	}
	
	public Computer(String brand, String model, String retailPrice) {
		// TODO Auto-generated constructor stub
		super();
		this.brand = brand;
		this.model = model;
		this.retailPrice = retailPrice;
	}
	
	public Computer(int id, String brand, String model, String retailPrice) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.retailPrice = retailPrice;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the retailPrice
	 */
	public String getRetailPrice() {
		return retailPrice;
	}

	/**
	 * @param retailPrice the retailPrice to set
	 */
	public void setRetailPrice(String retailPrice) {
		this.retailPrice = retailPrice;
	}
	
	/**
	 * @return the details
	 */
	public Details getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(Details details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Computer [id = " + id + ", brand = " + brand + ", model = " + model + 
				", retailPrice = " + retailPrice + ", details = " + details + "]";
	}
}
