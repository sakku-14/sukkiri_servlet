package model;

public class HealthCheckLogic {
	public static void calcBmi(Health h) {
		double height = h.getHeight() / 100;
		double weight = h.getWeight();
		double b = weight / (height * height);
		h.setBmi(b);
	}
	
	public static void setBodyStyle(Health h) {
		double bmi = h.getBmi();
		if (bmi < 18.5) {
			h.setBodyStyle("痩せ型");
		} else if (bmi < 25) {
			h.setBodyStyle("普通");
		} else {
			h.setBodyStyle("肥満");
		}
	}
}