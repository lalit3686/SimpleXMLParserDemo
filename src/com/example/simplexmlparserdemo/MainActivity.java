package com.example.simplexmlparserdemo;

import java.io.File;
import java.io.InputStream;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        readExampleXml();
        writeExampleXml();
        readMihirXml();
    }
    
    private void writeExampleXml() {

		Serializer serializer = new Persister();
		try {
			Example example = new Example("Lalit Poptani", 123456);
			File file = new File(Environment.getExternalStorageDirectory().toString()+File.separator+"myxml.xml");
			serializer.write(example, file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
    private void readExampleXml() {
		Serializer serializer = new Persister();
		InputStream raw;
		try {
			raw = getAssets().open("myxml.xml");
			Example example = serializer.read(Example.class, raw);
			Log.d("text", example.getMessage());
			Log.d("field", example.getId()+"");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
	private void readMihirXml() {
		Serializer serializer = new Persister();
		InputStream raw;
		try {
			raw = getAssets().open("mihir.xml");
			Mihir mihir = serializer.read(Mihir.class, raw);
			Log.d("text", mihir.getText());
			Log.d("field", (mihir.getField()).getName());
			Log.d("message", (mihir.getField()).getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
