
public class Phone {
 String brand;
 String Pname;
 int yearR;
 double price;
 
	public Phone(String brand, String Pname, int yearR, double price) {
		
		this.brand=brand;
		this.Pname=Pname;
		this.yearR=yearR;
		this.price=price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public int getYearR() {
		return yearR;
	}

	public void setYearR(int yearR) {
		this.yearR = yearR;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}
