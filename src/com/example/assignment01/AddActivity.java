package com.example.assignment01;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class AddActivity extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_item, menu);
		return true;
	}
	
	public void addItem(View view) throws java.io.IOException
	{
		CarList carList = CarList.getInstance();
		
		EditText editText1;
		EditText editText2;
		EditText editText3;
		EditText editText4;
		EditText editText5;
		EditText editText6;
		EditText editText7;
		
		String make;
		String model;
		int year;
		String vin;
		double price;
		int MPG;
		String pictureURL;
		
		editText1 = (EditText) findViewById(R.id.edit_make);
		make = editText1.getText().toString();
		
		editText2 = (EditText) findViewById(R.id.edit_model);
		model = editText2.getText().toString();
		
		editText3 = (EditText) findViewById(R.id.edit_year);
		year = Integer.parseInt(editText3.getText().toString());
		
		editText4 = (EditText) findViewById(R.id.edit_vin);
		vin = editText4.getText().toString();
		
		editText5 = (EditText) findViewById(R.id.edit_price);
		price = Double.parseDouble(editText5.getText().toString());
		
		editText6 = (EditText) findViewById(R.id.edit_MPG);
		MPG = Integer.parseInt(editText6.getText().toString());
		
		editText7 = (EditText) findViewById(R.id.edit_pictureURL);
		pictureURL = editText7.getText().toString();
		
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy);
		
		
			
		//add a bunch of car elements to the car object
		// try to put the new item on the list
		//add the car to the car list
		
		Car car= new Car(make, model, year, vin, price, MPG, pictureURL);
		
		try
		{
	      carList.add(carList.size(), car);	

		}
		catch(IndexOutOfBoundsException e)
		{
		
			//catches the exception
		}
		
	}
}
