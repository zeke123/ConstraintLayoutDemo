package com.zhoujian.constraintlayoutdemo;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

public class ConstrainSetXActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_start);
    }

    public void onClick(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.setForceId(false);
        constraintSet.clone(this,R.layout.activity_example_end);
        TransitionManager.beginDelayedTransition(constraintLayout);
        constraintSet.applyTo(constraintLayout);
    }
}