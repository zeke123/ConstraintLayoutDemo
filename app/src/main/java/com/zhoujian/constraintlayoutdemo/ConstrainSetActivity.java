package com.zhoujian.constraintlayoutdemo;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

public class ConstrainSetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_constrain_set);
    }

    public void onClick(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        constraintSet.connect(R.id.earth,ConstraintSet.BOTTOM,ConstraintSet.PARENT_ID,ConstraintSet.BOTTOM);
        constraintSet.applyTo(constraintLayout);

    }
}