package com.example.assignment01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


import android.app.Activity;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class WriteToFileActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_write_to_file);
	}
	
	public void fileWrite(View view) throws java.io.IOException
	{
		EditText et1;  
		String outfilename;
        
        et1 = (EditText) findViewById(R.id.edit_outfile1); 
        if(et1.getText() != null)
        //name for output file
        	outfilename = et1.getText().toString();
        else
        	outfilename = "";
         
        TextView tv = (TextView) findViewById(R.id.text_status1); 
        
        tv.append("Output file's name is: " + outfilename +"\n");
    	
   
        //opens infile and assigns it to fsc
        //read through the documentation tied to the AssetManager
        //And looked up how in Android to open and write to an output file.
        //NOT SCANNER?
       
		
        tv.append(""+getExternalFilesDir(null));
        
		File outfile = new File(getExternalFilesDir(null), outfilename); 
		FileWriter fw = new FileWriter(outfile);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		CarList carList = CarList.getInstance();
		//we write all of the info into our output file
		for(int j = 0; j < carList.size(); j++)
		{
			pw.println(carList.get(j).getMake().toString()+"\n");
			pw.println(carList.get(j).getModel().toString()+"\n");
			pw.println(Integer.toString(carList.get(j).getYear())+"\n");
			pw.println(carList.get(j).getVin().toString()+"\n");
			
			pw.println(Integer.toString(carList.get(j).getMPG())+"\n");
			pw.println(carList.get(j).getPictureURL().toString()+"\n");
			
		}
		
		pw.close(); //closes the "writers"
    	bw.close(); 
    	fw.close();
		
	}
}



