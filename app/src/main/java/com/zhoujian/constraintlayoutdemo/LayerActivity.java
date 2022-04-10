package com.zhoujian.constraintlayoutdemo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Layer;

public class LayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_layer);
        Layer layer = findViewById(R.id.layer);
        findViewById(R.id.button).setOnClickListener(view -> {
            layer.setRotation(45F);
            layer.setTranslationX(100F);
            layer.setTranslationY(100F);
        });
    }
}