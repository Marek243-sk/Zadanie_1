package sk.tuke.zadanie_1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class DrawView extends View {

    //inštancia triedy Paint na kreslenie objektov
    public Paint paint;

    //obrázok vesmírnej lode
    public Bitmap spaceship;

    //obrázok meteoritu
    public Bitmap meteor;


    //x-súradnice vesmírnej lode
    public float spaceshipX;

    //y-súradnice vesmírnej lode
    public float spaceshipY;

    // x-súradnice meteoritu
    public float meteorX;

    // y-súradnice meteoritu
    public float meteorY;

    //šírka obrazovky
    public float screenWidth;

    //výška obrazovky
    public float screenHeight;
    public DrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void loadBitmaps() {
        //načítanie obrázkov z res-> drawable
        spaceship = BitmapFactory.decodeResource(getResources(), R.drawable.spaceship);
        meteor = BitmapFactory.decodeResource(getResources(), R.drawable.meteor);

        //nastavenie x a y súradníc pre obrázky
        spaceshipX = screenWidth / 2 - spaceship.getWidth() / 2; //stred obrazovky
        spaceshipY = screenHeight - spaceship.getHeight() - 100; //spodok obrazovky s odstupom

        meteorX = (float) (Math.random() * (screenWidth - meteor.getWidth())); //náhodná pozícia v hornej časti obrazovky
        meteorY = -meteor.getHeight(); //mimo obrazovky
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //vykreslenie vesmírnej lode
        canvas.drawBitmap(spaceship, spaceshipX, spaceshipY, paint);

        //vykreslenie meteoritu
        canvas.drawBitmap(meteor, meteorX, meteorY, paint);
    }

}
