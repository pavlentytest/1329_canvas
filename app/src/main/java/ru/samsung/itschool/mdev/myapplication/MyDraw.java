package ru.samsung.itschool.mdev.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyDraw extends View {

    public MyDraw(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);
        Paint pen = new Paint();
        pen.setColor(Color.RED);
        pen.setAntiAlias(true); // сглаживание
        //pen.setColor(Color.parseColor("#ff0000"));
        //pen.setColor(Color.rgb(200,200,100));
        pen.setStrokeWidth(20);
        pen.setStyle(Paint.Style.STROKE); // тип заливка
        canvas.drawColor(Color.YELLOW); // цвет холста
        canvas.drawCircle(canvas.getWidth()/2,
                canvas.getHeight()/2,300,pen);

        Path path = new Path();
        path.moveTo(600,600);
        path.lineTo(700,700);
        path.lineTo(500,600);
        pen.setStyle(Paint.Style.FILL);
        canvas.drawPath(path,pen);

        Bitmap bitmap =
                BitmapFactory.decodeResource(getResources(),R.drawable.football);
        //canvas.drawBitmap(bitmap,0,0,pen);

        canvas.rotate(45,200,200);
        pen.setTextSize(150);
        canvas.drawText("Hello!",50,100,pen);
        canvas.rotate(-45,200,200);

    }
}
