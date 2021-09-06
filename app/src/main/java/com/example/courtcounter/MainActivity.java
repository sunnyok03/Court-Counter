package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int currentScoreOfA = 0;
    int currentScoreOfB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPlusThreeA(View view) {
        currentScoreOfA += 3;
        displayForTeamA(currentScoreOfA);
    }

    public void buttonPlusTwoA(View view) {
        currentScoreOfA += 2;
        displayForTeamA(currentScoreOfA);
    }

    public void buttonPlusOneA(View view) {
        currentScoreOfA += 1;
        displayForTeamA(currentScoreOfA);
    }

    public void buttonPlusThreeB(View view) {
        currentScoreOfB += 3;
        displayForTeamB(currentScoreOfB);
    }

    public void buttonPlusTwoB(View view) {
        currentScoreOfB += 2;
        displayForTeamB(currentScoreOfB);
    }

    public void buttonPlusOneB(View view) {
        currentScoreOfB += 1;
        displayForTeamB(currentScoreOfB);
    }
    //RESET button functionality
    public void reset(View view) {
        currentScoreOfA = 0;
        currentScoreOfB = 0;
        displayForTeamA(currentScoreOfA);
        displayForTeamB(currentScoreOfB);
    }

    /**
     * Displays the given score for Team A.
     */
    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}

