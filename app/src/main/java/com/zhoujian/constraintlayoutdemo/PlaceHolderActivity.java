package com.zhoujian.constraintlayoutdemo;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Placeholder;

public class PlaceHolderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_place_holder);
    }

    public void onClick(View view){
        Placeholder placeholder = findViewById(R.id.placeholder);
        placeholder.setContentId(view.getId());
    }
}