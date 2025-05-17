package com.example.cashtonton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int points = 0;
    TextView pointText;
    Button watchAdBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pointText = findViewById(R.id.pointText);
        watchAdBtn = findViewById(R.id.watchAdBtn);

        watchAdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                points += 10;
                pointText.setText("Poin: " + points);
                watchAdBtn.setEnabled(false);
                watchAdBtn.setText("Tunggu 60 detik...");

                watchAdBtn.postDelayed(() -> {
                    watchAdBtn.setEnabled(true);
                    watchAdBtn.setText("Tonton Iklan");
                }, 60000);
            }
        });
    }
}