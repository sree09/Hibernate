package hibernate;

public class CarBean {
String vin;
String make;
String model;
int year;
float mileage;
float price;
public CarBean() {
	
}
public String getVin() {
	return vin;
}
public void setVin(String vin) {
	this.vin = vin;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public float getMileage() {
	return mileage;
}
public void setMileage(float mileage) {
	this.mileage = mileage;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}

}
