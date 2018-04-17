import java.util.Scanner;

public class Date {
	
	private int year;
	private String month;
	private int day;
	
	public void setDate (int y, String m, int d) {
		month = m;
		year = y;
		day = d;
	}
	
	public void printDate () {
		System.out.println(year + "³â " + month + "¿ù " + day +"ÀÏ");
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	
	
	
}
