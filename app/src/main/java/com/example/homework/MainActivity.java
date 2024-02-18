package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<CardModel> models=new ArrayList<>();
    int[] images = {R.drawable.icon25,R.drawable.icon26,
            R.drawable.icon27,R.drawable.icon28,R.drawable.icon29,R.drawable.icon30,
            R.drawable.icon31,R.drawable.icon32,R.drawable.icon33,R.drawable.icon34,
            R.drawable.icon35,R.drawable.icon36,R.drawable.icon37,R.drawable.icon38,
            R.drawable.icon39,R.drawable.icon40,R.drawable.icon41,R.drawable.icon42,
            R.drawable.icon43,R.drawable.icon44};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void  setUpModels()
    {
        String[] texts= getResources().getStringArray(R.array.items_array);
        for(int i=0;i<texts.length;i++)
        {
            models.add(new CardModel(texts[i],images[i]));
        }
    }
}