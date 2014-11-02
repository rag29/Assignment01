package com.example.assignment01;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Car extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_car);
	}
	
	//declares the 7 variables that characterize a car object	
	String make;
	String model;
	int year;
	String vin;
	double price;
	int MPG;
	String pictureURL;

	//constructor method for Car class
	public Car
	(	
		String make,
		String model,
		int year,
		String vin,
		double price,
		int MPG,
		String pictureURL
    )
	
	{
		this.make = make;
		this.model = model;
		this.year = year;
		this.vin = vin;
		this.price = price;
		this.MPG = MPG;
		this.pictureURL = pictureURL;

	}
	//accessor methods for the Car class
	//to get the info about a Car

		
	
		public String getMake()  
		{
			return make;   
		}

		public String getModel()  
		{
			return model;   
		}

		public int getYear()  
		{
			return year;   
		}

		public String getVin()  
		{
			return vin;   
		}

		public double getPrice()  
		{
			return price;  
		}

		public int getMPG()  
		{
			return MPG;   
		}
		
		public String getPictureURL()
		{
			return pictureURL;
		}
		
		public String toString()
		{
			return make + "\n " + model + "\n " + year + "\n " + vin + "\n " + price + "\n " + pictureURL;
		}
		public double getTaxCredit(Car car)
		{
			
			if(car.getMPG() >= 35)
			{
				double retVal = car.getPrice() * .03;
				return retVal;
			}
			else
			{
				return 0.0;
			}
			
		}
		
}
