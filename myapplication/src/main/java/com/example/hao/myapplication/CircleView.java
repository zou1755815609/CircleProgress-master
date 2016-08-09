package com.example.hao.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by hao on 2016/8/9.
 */
public class CircleView extends View {
    private Paint bigCirclePaint;
    private Paint smallCirclePaint;
    private RectF mectF;
    private Path mPath;
    private int maxColorNumber = 100;
    private float singlPoint = 9;
    private float lineWidth = 0.3f;
    private float progress = 0;


    public CircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        bigCirclePaint = new Paint();
        bigCirclePaint.setAntiAlias(true);
        bigCirclePaint.setStrokeWidth(2);
        bigCirclePaint.setColor(Color.GRAY);
        smallCirclePaint = new Paint();
        smallCirclePaint.setAntiAlias(true);
        smallCirclePaint.setStrokeWidth(2);
        smallCirclePaint.setColor(Color.YELLOW);
        mectF = new RectF(50, 50, 350, 350);
        mPath = new Path();
        mPath.addArc(mectF, 0,150);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(200, 200, 150, bigCirclePaint);
        float start = -90f;
//        float p = ((float) maxColorNumber / (float) 100);
//        p = (int) (progress * p);
//        for (int i = 0; i < 100; i++) {
//            smallCirclePaint.setColor(Color.WHITE);
//            // 绘制间隔快
//            canvas.drawArc(mectF, start + singlPoint - lineWidth, lineWidth, false,smallCirclePaint);
//            start = (start + singlPoint);
//        }
        float degrees = (float) (360.0/100);
        smallCirclePaint.setColor(Color.RED);
        canvas.save();
        canvas.translate(50,200);
        for(int i = 0;i<100;i++){
            canvas.drawLine(0, 0, 20, 0, smallCirclePaint);
            canvas.rotate(degrees, 150, 0);
        }
        canvas.save();
        canvas.translate(-50,-200);
        smallCirclePaint.setColor(Color.BLUE);
        canvas.drawArc(mectF,-180,90,true, smallCirclePaint);
        smallCirclePaint.setColor(Color.WHITE);
        canvas.drawCircle(200, 200, 80, smallCirclePaint);
    }
}
