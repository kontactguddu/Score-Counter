package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreOfTeamA = 0;
    int scoreOfTeamB = 0;
    // Team A code
    public void threePointsA(View view){
        scoreOfTeamA += 3;
        displayScoreTeamA(scoreOfTeamA);
    }
    public void twoPointsA(View view){
        scoreOfTeamA += 2;
        displayScoreTeamA(scoreOfTeamA);
    }
    public void onePointA(View view){
        scoreOfTeamA += 1;
        displayScoreTeamA(scoreOfTeamA);
    }
    // Team B code
    public void threePointsB(View view){
        scoreOfTeamB += 3;
        displayScoreTeamB(scoreOfTeamB);
    }
    public void twoPointsB(View view){
        scoreOfTeamB += 2;
        displayScoreTeamB(scoreOfTeamB);
    }
    public void onePointB(View view){
        scoreOfTeamB += 1;
        displayScoreTeamB(scoreOfTeamB);
    }

    // Reset Button code
    public void resetButton(View view){
        scoreOfTeamA = 0;
        scoreOfTeamB = 0;
        displayScoreTeamA(scoreOfTeamA);
        displayScoreTeamB(scoreOfTeamB);
    }

    public void displayScoreTeamA(int i){
        TextView t1 = (TextView) findViewById(R.id.score_Team_A);
        t1.setText(""+i);
    }
    public void displayScoreTeamB(int i){
        TextView t1 = (TextView) findViewById(R.id.score_Team_B);
        t1.setText(""+i);
    }
}