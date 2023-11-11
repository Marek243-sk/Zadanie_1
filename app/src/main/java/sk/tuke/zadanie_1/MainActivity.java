package sk.tuke.zadanie_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //uchovávanie aktuálneho skóre hráča
    public int score;

    // uchovávanie počtu životov hráča
    public int lives;

    //ublicávanie času, kedy sa začala hra
    public long startTime;

    //ublicvávanie časového limitu hry v milisekundách
    public long timeLimit;

    //ublicávanie stavu, či je hra ukončená alebo nie
    public boolean isGameOver;

    //ublicávanie inštancie triedy DrawView na vykresľovanie hry
    public DrawView drawView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //startGame();
        //Intent play = new Intent(MainActivity.this, DrawView.class);
    }

    public void startGame() {
        //nastavenie počiatočných hodnôt
        score = 0;
        lives = 3;
        startTime = System.currentTimeMillis();
        timeLimit = 60000; //60 sekúnd
        isGameOver = false;

        //vytvorenie inštancie DrawView
        drawView = new DrawView(this, null);

        //zobrazenie hry na obrazovke
        setContentView(drawView);
    }

}