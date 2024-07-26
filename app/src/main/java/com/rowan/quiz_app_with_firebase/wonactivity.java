package com.rowan.quiz_app_with_firebase;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class wonactivity extends AppCompatActivity {
TextView scoreview;
int correct;
int incorrect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_wonactivity);
      scoreview=findViewById(R.id.score);
correct= getIntent().getIntExtra("correct",0);
incorrect= getIntent().getIntExtra("incorrect",0);
scoreview.setText(correct);
        String scoreText = "Correct: " + correct + "\nIncorrect: " + incorrect;
        scoreview.setText(scoreText);
    }
}