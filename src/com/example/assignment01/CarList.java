package com.example.assignment01;

import java.util.LinkedList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

//creates the singleton carlist that will be used throughout the project
public final class CarList extends LinkedList<Car>
{

		private static CarList instance = null; 
			   
		private CarList()
		{
			// Exists only to defeat additional instantiations.
		}
			   
		public static CarList getInstance()
		{
			  if(instance == null)
			         instance = new CarList();
			      
			  return instance;
		}
			   
	} // end CarList

	
	
	
	

