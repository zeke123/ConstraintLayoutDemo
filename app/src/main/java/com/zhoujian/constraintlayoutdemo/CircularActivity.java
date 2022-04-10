package com.zhoujian.constraintlayoutdemo;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class CircularActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_circular);

        ImageView imageViewMoon = findViewById(R.id.moon);
        ImageView imageViewEarth = findViewById(R.id.earth);
        ImageView imageViewSun = findViewById(R.id.sun);

        ValueAnimator earthAnimator = ValueAnimator.ofFloat(0f, 1f);
        earthAnimator.setDuration(10000L);
        earthAnimator.setRepeatCount(ValueAnimator.INFINITE);
        earthAnimator.setInterpolator(new LinearInterpolator());
        earthAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) imageViewEarth.getLayoutParams();
                layoutParams.circleAngle = 45 + earthAnimator.getAnimatedFraction() * 360;
                imageViewMoon.requestLayout();
            }
        });

        ValueAnimator moonAnimator = ValueAnimator.ofFloat(0f, 1f);
        moonAnimator.setDuration(10000L);
        moonAnimator.setRepeatCount(ValueAnimator.INFINITE);
        moonAnimator.setInterpolator(new LinearInterpolator());
        moonAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) imageViewMoon.getLayoutParams();
                layoutParams.circleAngle = 270 + moonAnimator.getAnimatedFraction() * 360;
                imageViewMoon.requestLayout();
            }
        });


        imageViewSun.setOnClickListener(view -> {
            earthAnimator.start();
            moonAnimator.start();
        });
    }
}