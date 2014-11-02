//////////////////////////////////////////////////////////////////////////////////
//                                                                              //
//                                                                              //
// Robert Gioia                                                                 //
// IT114, Section 003                                                           //
// Dr. Halper                                                                   //
// App Project #1                                                               //
// Nov. 5, 2014                                                                 //
//                                                                              //
// This app is designed to manage a list of cars for sale by a dealership.      // 
// The user is provided with 11 options, ranging from displaying various        //
// characteristics of these cars to adding new cars to the list. Each car       //
// is represented as an object in the context of this program.                  //
//                                                                              //
//                                                                              //
//////////////////////////////////////////////////////////////////////////////////

package com.example.assignment01;

import java.util.Scanner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
        CarList carList;
		
		// set the reference to the "main" textview object so
		// we do not have to retrieve it in every method below
				
		
		
		// create/access the list of strings
		
		carList = CarList.getInstance();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
        
	}

	
	// set the reference to the "main" textview object so
	// we do not have to retrieve it in every method below
		
	//TextView tv = (TextView) findViewById(R.id.text_main);
	
	// create/access the list of cars
	
	//CarList carList = CarList.getInstance();
	
public void onOption1(MenuItem i)
{ 
	/*
	CarList carList;
	int j;
	// get an instance of the list
    carList = CarList.getInstance();
    //check to make sure carlist isn't empty
    //as long as there are elements (cars) in the car list, 
    //display those cars to the user
	if(!carList.isEmpty())
	{
	tv.setText("");
    
    for(j = 0; j < carList.size(); j++)
    	tv.append(carList.get(j).toString() + '\n');
	}
	
	*/
} // end onOption1

public void onOption2(MenuItem i)
{
	/*
	// show the list in reverse order
	CarList carList;
	tv.setText("");
	
	carList = CarList.getInstance();
	
	for(int m = carList.size() - 1; m >= 0; m--)
	{
		tv.append(carList.get(m).toString() + '\n');
	}
	
	*/
} // end onOption2

public void onOption3(MenuItem i) //throws IOException
{
	/*
   	// Start the activity to add a new item to the list
	
	startActivity(new Intent(this, AddActivity.class)); 
	*/
 
}   
public void onOption4(MenuItem i)
{
	/*
	CarList carList;
	carList = CarList.getInstance();
   	// Show details of the car
	// VIN is given by user 
	// Edit text is needed to get the VIN from the user
	// To display the car's details, we use a text view.
	TextView tv1 = (TextView) findViewById(R.id.text_main1); 
	
	EditText et1 = (EditText) findViewById(R.id.edit_text1);
	
	Scanner scan = new Scanner(System.in);
	
	//Must retrieve car's vin from user and save it in vin variable
	
	String vin = scan.next(); 
	
	tv.setText("");
	//check to see each car in the list
	//if the vin belongs to a particular car,
	//display all of the details of that car.
	for(int j = 0; j < carList.size(); j++)
	{
		if(carList.get(j).getVin() == vin)
		{
			tv.append(carList.get(j).getMake().toString()+"\n"+"\n");
			tv.append(carList.get(j).getModel().toString()+"\n"+"\n");
			tv.append(Integer.toString(carList.get(j).getYear())+"\n"+"\n");
			tv.append(carList.get(j).getVin().toString()+"\n"+"\n");
			if(carList.get(j).getPrice() != 0)
			{
				tv.append((Double.toString(carList.get(j).getPrice())+"\n"+"\n"));
			}
			tv.append(Integer.toString(carList.get(j).getMPG())+"\n"+"\n");
			tv.append(carList.get(j).getPictureURL().toString()+"\n"+"\n");
			
			try
		    {
				ImageView iv = (ImageView) findViewById(R.id.image_load);
				// download and display the image in the ImageView
				ImageDownloader idl = new ImageDownloader();
				String image_url = carList.get(j).getPictureURL();
				idl.download(image_url, iv);
		    }catch(Exception e){}
		}
	}
	
	*/
} // end onOption4

public void onOption5(MenuItem i) throws Exception
{
	/*
	// Delete a car
	CarList carList = CarList.getInstance(); 
	Scanner scan = new Scanner(System.in);

	String vin = scan.next();
	
	for(int j = 0; j < carList.size(); j++)
	{
		try
		{
			if(vin == carList.get(j).getVin())
			{
				EditText editText1;
				EditText editText2;
				String new_item;
				int pos;
				CarList the_list;
				
				editText2 = (EditText) findViewById(R.id.edit_position2);
				pos = Integer.parseInt(editText2.getText().toString());
				
					// Get the string list instance
				
				the_list = CarList.getInstance();
		
					// try to put the new item on the list
		
					try
					{
					   the_list.remove(pos);
				    
					}
					catch(IndexOutOfBoundsException e)
					{
						//catches a possible index out of bounds exception
					}
		       } //ends if statement  
		  }//ends try
		catch(Exception e)
		{	
			System.out.println("The car is not on the list");
			throw e;
		}
	} //ends for loop
	*/
} // end onOption5

public void onOption6(MenuItem i)
{
	/*
	//Show average price of cars
	CarList carList;
	//To accomplish the task of this option, we:
	//1. Get the price of each car object in the list
	//2. Average them
	//3. Display the average
	
	TextView tv = (TextView) findViewById(R.id.text_main3);
	tv.setText("");
	    
	carList = CarList.getInstance();
	
		int sum = 0;
		int z;
		for(z = 0; z < carList.size(); z++)
		{
			sum += carList.get(z).getPrice();
		}
		tv.append("Average price is: " + Double.toString(sum/z) + '\n'); 
		*/
} // end onOption6

public void onOption7(MenuItem i)
{
	/*
	//Show average MPG of cars
	//Get the MPG from each car object in the list
	//Average them
	//Display the average
	CarList carList;
	TextView tv = (TextView) findViewById(R.id.text_main4);
	tv.setText("");
	    
	carList = CarList.getInstance();
	
		int sum = 0;
		int y;
		for(y = 0; y < carList.size(); y++)
		{
			sum += carList.get(y).getMPG();
		}
		tv.append("Average MPG is: " + Double.toString(sum/y) + '\n'); 
       */
}//ends onOption7

public void onOption8(MenuItem i)
{       /*
	//Show the price of the least expensive car
	//Get all of the prices of the car objects in the list
	//Compare them 
	//display the price of the least expensive car
	CarList carList;
	
	TextView tv = (TextView) findViewById(R.id.text_main5);
	tv.setText("");
	    
	carList = CarList.getInstance();
	
	double least = carList.get(0).getPrice();
	
	int y;
	for(y = 1; y < carList.size(); y++)
	{
		if(carList.get(y).getPrice() < least)
		{
			least = carList.get(y).getPrice();
		}
	}
	tv.append("Lowest price is: " + Double.toString(least) + '\n'); 
			
	*/
} //ends onOption8

public void onOption9(MenuItem i)
{
	/*
	//Show highest MPG
	//Get all of the MPGs of the car objects in the list
	//Compare them
	//display the highest MPG
	CarList carList;
	
	TextView tv = (TextView) findViewById(R.id.text_main6);
	tv.setText("");
	    
	carList = CarList.getInstance();
	
	int highest = carList.get(0).getMPG();
	
	int y;
	for(y = 1; y < carList.size(); y++)
	{
		if(carList.get(y).getMPG() > highest)
		{
			highest = carList.get(y).getMPG();
		}
	}
	tv.append("Highest MPG is: " + Integer.toString(highest) + '\n'); 
	*/
} //ends onOption9

public void onOption10 (MenuItem i)
{
	/*
	//Load list from file
	
	startActivity(new Intent(this,LoadActivity.class)); 
	
	*/
} //ends onOption10

public void onOption11 (MenuItem i)
{
	/*
	//Save list to file

	startActivity(new Intent(this,WriteToFileActivity.class));
	*/
} //ends onOption11


	
	
}

