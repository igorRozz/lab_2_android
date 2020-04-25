package com.example.lab_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements Output_interface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    public void output(String text) {
        Output_fragment frag = (Output_fragment)getSupportFragmentManager().findFragmentById(R.id.fragment_output);
        if(frag !=null)
        {
            frag.setText(text);
        }
    }
}
