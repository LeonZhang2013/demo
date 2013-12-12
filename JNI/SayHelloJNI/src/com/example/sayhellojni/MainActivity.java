package com.example.sayhellojni;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        HelloJNI h = new HelloJNI();
        Toast.makeText(this,  h.sayHello(), Toast.LENGTH_LONG).show();
        //Toast.makeText(this, text, duration).show();
    }

    
}
