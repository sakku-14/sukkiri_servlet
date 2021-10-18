package model;
import java.io.Serializable;

public class Health implements Serializable {
	private double height;
	private double weight;
	private double bmi;
	private String bodyStyle;
	
	public Health() {
	}
	
	public Health(double h, double w) {
		this.height = h;
		this.weight = w;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public String getBodyStyle() {
		return bodyStyle;
	}

	public void setBodyStyle(String bodyStyle) {
		this.bodyStyle = bodyStyle;
	}
	
	
	
}