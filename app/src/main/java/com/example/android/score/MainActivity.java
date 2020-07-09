package com.example.android.score;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int pointTeam1 = 0;
    int pointTeam2 = 0;
    int yellowCard1 = 0;
    int yellowCard2 = 0;
    int redCard1 = 0;
    int redCard2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeam1);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeam2);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeam1yellow(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellowCardTeam1);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeam2yellow(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellowCardTeam2);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeam1red(int score) {
        TextView scoreView = (TextView) findViewById(R.id.redCardTeam1);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeam2red(int score) {
        TextView scoreView = (TextView) findViewById(R.id.redCardTeam2);
        scoreView.setText(String.valueOf(score));
    }

    public void golTeam1 (View view) {
        pointTeam1 = pointTeam1 + 1;
        displayForTeam1(pointTeam1);
    }

    public void yellowCard1Plus (View view) {
        yellowCard1 = yellowCard1 + 1;
        displayForTeam1yellow(yellowCard1);
    }

    public void yellowCard1Minus (View view) {
        yellowCard1 = yellowCard1 - 1;
        displayForTeam1yellow(yellowCard1);
    }

    public void redCard1Plus (View view) {
        redCard1 = redCard1 + 1;
        displayForTeam1red(redCard1);
    }

    public void redCard1Minus (View view) {
        redCard1 = redCard1 - 1;
        displayForTeam1red(redCard1);
    }

    public void golTeam2 (View view) {
        pointTeam2 = pointTeam2 +1;
        displayForTeam2(pointTeam2);
    }

    public void yellowCard2Plus (View view) {
        yellowCard2 = yellowCard2 + 1;
        displayForTeam2yellow(yellowCard2);
    }

    public void yellowCard2Minus (View view) {
        yellowCard2 = yellowCard2 - 1;
        displayForTeam2yellow(yellowCard2);
    }

    public void redCard2Plus (View view) {
        redCard2 = redCard2 + 1;
        displayForTeam2red(redCard2);
    }

    public void redCard2Minus (View view) {
        redCard2 = redCard2 - 1;
        displayForTeam2red(redCard2);
    }

    public void resetScoreTeam1 (View view) {
        pointTeam1 = 0;
        displayForTeam1(pointTeam1);
    }

    public void resetScoreTeam2 (View view) {
        pointTeam2 = 0;
        displayForTeam2(pointTeam2);
    }

    public void resetAll (View view) {
        pointTeam1 = 0;
        pointTeam2 = 0;
        yellowCard1 = 0;
        yellowCard2 = 0;
        redCard1 = 0;
        redCard2 = 0;
        displayForTeam1(pointTeam1);
        displayForTeam2(pointTeam2);
        displayForTeam1yellow(yellowCard1);
        displayForTeam2yellow(yellowCard2);
        displayForTeam1red(redCard1);
        displayForTeam2red(redCard2);
    }
}