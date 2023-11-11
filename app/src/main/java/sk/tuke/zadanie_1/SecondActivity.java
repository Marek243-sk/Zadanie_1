package sk.tuke.zadanie_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Button playButton = findViewById(R.id.play_button);
        playButton.setOnClickListener(v -> {
            startActivity(new Intent(SecondActivity.this, MainActivity.class));
            finish();
        });

    }
}
