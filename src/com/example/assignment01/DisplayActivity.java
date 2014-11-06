package com.example.assignment01;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display, menu);
		return true;
	}
public void DisplayCar(View view)
{
	TextView tv = (TextView) findViewById(R.id.text_main);
	CarList carList = CarList.getInstance();
	EditText et1 = (EditText) findViewById(R.id.edit_text1);
	String vin;
	boolean found = false; //use this as a flag
	int j = 0;
   	// Show details of the car
	// VIN is given by user 
	// Edit text is needed to get the VIN from the user
	// To display the car's details, we use a text view.

	
	
	
	
	//Must retrieve car's vin from user and save it in vin variable
	
	
	if(et1.getText() != null)
	{
		vin = et1.getText().toString();
	}
	else
	{
		vin = "";
		tv.setText("");
	}
	
	//check to see each car in the list
	//if the vin belongs to a particular car,
	//display all of the details of that car.
	
	while(!found && j < carList.size())
	{

		if(carList.get(j).getVin().equals(vin))
		{//get rid of extra tostrings
			tv.setText(" ");
			found=true;
			tv.append("Make: " + carList.get(j).getMake()+"\n"+"\n");
			tv.append("Model: " + carList.get(j).getModel()+"\n"+"\n");
			tv.append("Year: " + Integer.toString(carList.get(j).getYear())+"\n"+"\n");
			tv.append("Vin: " + carList.get(j).getVin()+"\n"+"\n");
			tv.append(("Price: " + Double.toString(carList.get(j).getPrice())+"\n"+"\n"));
			if(carList.get(j).getTaxCredit() != 0)
			{
				tv.append(("Tax Credit: " + Double.toString(carList.get(j).getTaxCredit())+"\n"+"\n"));
			}
			tv.append("MPG: " + Integer.toString(carList.get(j).getMPG()) +"\n"+"\n");
			//tv.append("Picture URL" + carList.get(j).getPictureURL() +"\n"+"\n");
			
			try
		    {
				ImageView iv = (ImageView) findViewById(R.id.image_load);
				// download and display the image in the ImageView
				ImageDownloader idl = new ImageDownloader();
				String image_url = carList.get(j).getPictureURL();
				idl.download(image_url, iv);
		    }catch(Exception e){}
		}
		else
		{j++;} //if not found after loop, display error message
	}
    if(found == false)
    {
    	tv.setText("Enter a real vin that is on the list!");
    }
	}
	
}
