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
    
        
        et1 = (EditText) findViewById(R.id.edit_outfile1); 
      
        //name for output file
        String outfilename = et1.getText().toString(); 
         
        TextView tv = (TextView) findViewById(R.id.text_status1); 
        
        tv.append("Output file's name is: " + outfilename +"\n");
    	
        //Important to use because infile is in assets folder
        AssetManager assetManager = getAssets(); 
        //opens infile and assigns it to fsc
        Scanner fsc = new Scanner(assetManager.open(outfilename)); 
		
        tv.append(""+getExternalFilesDir(null));
        
		File outfile = new File(getExternalFilesDir(null), outfilename); 
		FileWriter fw = new FileWriter(outfile);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		CarList carList = CarList.getInstance();
		//we write all of the info into our output file
		for(int j = 0; j < carList.size(); j++)
		{
			pw.println(carList.get(j).getMake().toString()+"\n"+"\n");
			pw.println(carList.get(j).getModel().toString()+"\n"+"\n");
			pw.println(Integer.toString(carList.get(j).getYear())+"\n"+"\n");
			pw.println(carList.get(j).getVin().toString()+"\n"+"\n");
			if(carList.get(j).getPrice() != 0)
			{
				pw.println((Double.toString(carList.get(j).getPrice())+"\n"+"\n"));
			}
			pw.println(Integer.toString(carList.get(j).getMPG())+"\n"+"\n");
			pw.println(carList.get(j).getPictureURL().toString()+"\n"+"\n");
			
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

}

