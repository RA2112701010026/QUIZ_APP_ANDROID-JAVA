package com.rowan.quiz_app_with_firebase;

import static com.rowan.quiz_app_with_firebase.MainActivity.quizQuestions;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.Collections;
import java.util.List;

public class quiz_page extends AppCompatActivity {
    ProgressBar timebar;
    CountDownTimer countDownTimer;
    int timer = 200;
    int index = 0;
    List<modelclass> allquestionlist;
    modelclass Modelclass;
    TextView optionA, optionB, optionC, optionD, questiontext;
    CardView questioncard, anscard1, anscard2, anscard3, anscard4;
    Button nextbtn;
    int correctcount = 0;
    int wrongcount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_quiz_page);

        hooks();

        allquestionlist = quizQuestions;
        if (allquestionlist != null && !allquestionlist.isEmpty()) { // Added null and empty check for question quizQuestions
            Collections.shuffle(allquestionlist);
            Modelclass = allquestionlist.get(index);
            setAllData();
            startTimer();
        } else {
            Log.e("QuizApp", "Question quizQuestions is empty or null."); // Log error if question quizQuestions is empty or null
        }
    }

    private void setAllData() {
        if (Modelclass != null) { // Added null check for Modelclass
            questiontext.setText(Modelclass.getMyquestions());
            optionA.setText(Modelclass.getOptionA()); // Fixed getter methods
            optionB.setText(Modelclass.getOptionB());
            optionC.setText(Modelclass.getOptionC());
            optionD.setText(Modelclass.getOptionD());
        } else {
            Log.e("QuizApp", "Modelclass is null."); // Log error if Modelclass is null
        }
    }

    private void hooks() {
        optionA = findViewById(R.id.optionA);
        optionB = findViewById(R.id.optionB);
        optionC = findViewById(R.id.optionC);
        optionD = findViewById(R.id.optionD);
        questiontext = findViewById(R.id.questiontext);

        timebar = findViewById(R.id.timebar);
        timebar.setMax(timer); // Set the max value for the progress bar

        questioncard = findViewById(R.id.questioncard);
        anscard1 = findViewById(R.id.anscard1);
        anscard2 = findViewById(R.id.anscard2);
        anscard3 = findViewById(R.id.anscard3);
        anscard4 = findViewById(R.id.anscard4);

        nextbtn = findViewById(R.id.nextbtn);
        nextbtn.setClickable(false); // Moved nextbtn.setClickable(false) after initialization
    }

    private void startTimer() {
        countDownTimer = new CountDownTimer(200000, 1000) { // 20000 milliseconds for 20 seconds
            @Override
            public void onTick(long millisUntilFinished) {
                if (timer > 0) { // Ensure timer doesn't go below zero
                    timer = timer - 1;
                    timebar.setProgress(timer);
                }
            }

            @Override
            public void onFinish() {
                showTimeUpDialog();
            }
        }.start();
    }

    private void showTimeUpDialog() {
        AlertDialog alertDialog = new AlertDialog.Builder(quiz_page.this).create();
        alertDialog.setTitle("Time up");
        alertDialog.setIcon(R.drawable.timeup);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "RESTART", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent2 = new Intent(quiz_page.this, MainActivity.class);
                startActivity(intent2);
            }
        });
        alertDialog.show();
    }

    public void correct(CardView cardView) { // Fixed method name from "corrct" to "correct"
        cardView.setCardBackgroundColor(getResources().getColor(R.color.forest_green));
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correctcount++;
                if (index < quizQuestions.size() - 1) { // Added bounds check for index
                    index++;
                    Modelclass = quizQuestions.get(index);
                    resetcolor();
                    enableButton();
                    setAllData();
                    startTimer();
                } else {
                    gamewon();
                }
            }
        });
    }

    public void wrong(CardView cardView) { // Corrected parameter name to match usage
        cardView.setCardBackgroundColor(getResources().getColor(R.color.red));
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrongcount++;
                if (index < quizQuestions.size() - 1) { // Added bounds check for index
                    index++;
                    Modelclass = quizQuestions.get(index);
                    resetcolor();
                    enableButton();
                    setAllData();
                } else {
                    gamewon();
                }
            }
        });
    }

    private void gamewon() {
        Intent wonintent = new Intent(quiz_page.this, wonactivity.class);
        startActivity(wonintent);
    }

    public void enableButton() {
        anscard1.setClickable(true);
        anscard2.setClickable(true);
        anscard3.setClickable(true);
        anscard4.setClickable(true);
    }

    public void disableButton() {
        anscard1.setClickable(false);
        anscard2.setClickable(false);
        anscard3.setClickable(false);
        anscard4.setClickable(false);
    }

    public void resetcolor() {
        anscard1.setCardBackgroundColor(getResources().getColor(R.color.white));
        anscard2.setCardBackgroundColor(getResources().getColor(R.color.white));
        anscard3.setCardBackgroundColor(getResources().getColor(R.color.white));
        anscard4.setCardBackgroundColor(getResources().getColor(R.color.white));
    }

    public void optionAclick(View view) {
        nextbtn.setClickable(true);
        disableButton();
        if (Modelclass.getOptionA().equals(Modelclass.getAnswers())) {
            anscard1.setCardBackgroundColor(getResources().getColor(R.color.forest_green));
            if (index < quizQuestions.size() - 1) {
                correct(anscard1);
            } else {
                gamewon();
            }
        } else {
            wrong(anscard1);
        }
    }

    public void optionBclick(View view) {
        nextbtn.setClickable(true);
        disableButton();
        if (Modelclass.getOptionB().equals(Modelclass.getAnswers())) {
            anscard2.setCardBackgroundColor(getResources().getColor(R.color.forest_green));
            if (index < quizQuestions.size() - 1) {
                correct(anscard2);
            } else {
                gamewon();
            }
        } else {
            wrong(anscard2);
        }
    }

    public void optionCclick(View view) {
        nextbtn.setClickable(true);
        disableButton();
        if (Modelclass.getOptionC().equals(Modelclass.getAnswers())) {
            anscard3.setCardBackgroundColor(getResources().getColor(R.color.forest_green));
            if (index < quizQuestions.size() - 1) {
                correct(anscard3);
            } else {
                gamewon();
            }
        } else {
            wrong(anscard3);
        }
    }

    public void optionDclick(View view) {
        nextbtn.setClickable(true);
        disableButton();
        if (Modelclass.getOptionD().equals(Modelclass.getAnswers())) {
            anscard4.setCardBackgroundColor(getResources().getColor(R.color.forest_green));
            if (index < quizQuestions.size() - 1) {
                correct(anscard4);
            } else {
                gamewon();
            }
        } else {
            wrong(anscard4);
        }
    }
}
