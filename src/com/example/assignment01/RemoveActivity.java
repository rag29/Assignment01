package com.example.assignment01;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class RemoveActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_remove);
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.remove_item, menu);
		return true;
	}
	
	public void RemoveCar(View view) throws Exception
	{	
	// Delete a car
		CarList carList = CarList.getInstance(); 
		

		EditText editText2 = (EditText) findViewById(R.id.edit_position2);
		
		
		String vin;
		if(editText2.getText() != null)
			vin = editText2.getText().toString();
		else
			vin = "";
		for(int j = 0; j < carList.size(); j++)
		{
			try
			{
				if(vin.equals( carList.get(j).getVin()))
				{
						// try to put the new item on the list
			
						try
						{
						   carList.remove(j);
						   break;
					    
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
		}
	}
}