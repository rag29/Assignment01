package com.example.assignment01;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class LoadActivity extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_load);
		EditText et1 = (EditText) findViewById(R.id.edit_files);
		et1.setText("http://web.njit.edu/~halper/it114/a1dat.txt", TextView.BufferType.EDITABLE);
		
	}


public void loadCar(View view) throws IOException
{
	
	StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
	StrictMode.setThreadPolicy(policy);
	
	EditText et1; 
    
    et1 = (EditText) findViewById(R.id.edit_files); 
    
    
    String infilename = et1.getText().toString(); 
    
	try{
	URL file_url = new URL(infilename); 
	Scanner fsc = new Scanner (file_url.openStream());
	
	
	String totalFile;
	
	int i = 0;
	
	String make;
	String model;
	int year;
	String vin;
	double price;
	int MPG;
	String pictureURL;
	
	//String[] strings = new String[6];
	CarList carList = CarList.getInstance();
	
	String oneLine;
	while(fsc.hasNext()) 
	{
			make=fsc.nextLine();
			model=fsc.nextLine();
			year=Integer.parseInt(fsc.nextLine().toString());
			vin=fsc.nextLine();
			price=Double.parseDouble(fsc.nextLine().toString());
			MPG=Integer.parseInt(fsc.nextLine().toString());
			pictureURL=fsc.nextLine();
		    //*********************need to do a new car thingy here!!!!!!!!!!!! and BINARY SEARCH THING
			//students[i] = new (strings[0].toString(), strings[1].toString(), strings[2].toString(), Double.parseDouble(strings[3]), strings[4].toString(), Integer.parseInt(strings[5]));
			
			Car car= new Car(make, model, year, vin, price, MPG, pictureURL);
			carList.add(carList.size(), car);
	 }
	
	
	
	}catch(Exception e){
		throw new IOException(e.toString());
	}
	
	
	
}

}
