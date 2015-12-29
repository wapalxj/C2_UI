package com.example.c310_ui_drawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;

/**
 * Created by Administrator on 2015/8/21.
 *  ShapeDrawable
 */
public class CustomDrawableView extends View{
    ShapeDrawable mShapeD;
    public CustomDrawableView(Context context) {
        super(context);
//        mShapeD=new ShapeDrawable(new OvalShape());
        mShapeD=new ShapeDrawable(new RectShape());
        mShapeD.setBounds(10,10,600,300);
        mShapeD.getPaint().setColor(Color.RED);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mShapeD.draw(canvas);
    }
}
