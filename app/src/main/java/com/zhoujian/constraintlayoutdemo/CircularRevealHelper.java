package com.zhoujian.constraintlayoutdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;

import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;

public class CircularRevealHelper extends ConstraintHelper {
    public CircularRevealHelper(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void updatePostLayout(ConstraintLayout container) {
        super.updatePostLayout(container);
        for (int referencedId : getReferencedIds()) {
            View view = container.getViewById(referencedId);
            float radius = (float) Math.hypot((double) view.getWidth(), (double) view.getHeight());
            ViewAnimationUtils.createCircularReveal(view, 0, 0, 0f, radius).setDuration(3000).start();
        }
    }
}
