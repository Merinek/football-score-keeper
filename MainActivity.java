package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreVisitors = 0;
    int scoreHome = 0;
    int redCardsVisitors = 0;
    int yellowCardsVisitors = 0;
    int redCardsHome = 0;
    int yellowCardsHome = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * All variables
     */

    public void reset(View v){
        scoreVisitors = 0;
        scoreHome = 0;
        redCardsVisitors = 0;
        yellowCardsVisitors = 0;
        redCardsHome = 0;
        yellowCardsHome = 0;
        displayForVisitorsScore(scoreVisitors);
        displayForVisitorsRedCards(redCardsVisitors);
        displayForVisitorsYellowCards(yellowCardsVisitors);
        displayForHomeScore(scoreHome);
        displayForHomeRedCards(redCardsHome);
        displayForHomeYellowCards(yellowCardsHome);
    }
    /**
     * Buttons actions for Visitors
     */

    public void addOneGoalForVisitors(View V){
        scoreVisitors = scoreVisitors + 1;
        displayForVisitorsScore(scoreVisitors);
    }
    public void addOneRedCardForVisitors(View V){
        redCardsVisitors = redCardsVisitors + 1;
        displayForVisitorsRedCards(redCardsVisitors);
    }
    public void addOneYellowCardForVisitors(View V){
        yellowCardsVisitors = yellowCardsVisitors + 1;
        displayForVisitorsYellowCards(yellowCardsVisitors);
    }

    /**
     * Displays the given info for Visitors.
     */
    public void displayForVisitorsScore(int scoreVisitor) {
        TextView scoreView = (TextView) findViewById(R.id.team_visitors_score);
        scoreView.setText(String.valueOf(scoreVisitor));

    }
    public void displayForVisitorsRedCards(int redCardsVisitors) {
        TextView scoreView = (TextView) findViewById(R.id.visitors_red_cards);
        scoreView.setText(String.valueOf(redCardsVisitors));

    }
    public void displayForVisitorsYellowCards(int yellowCardsVisitors) {
        TextView scoreView = (TextView) findViewById(R.id.visitors_yellow_cards);
        scoreView.setText(String.valueOf(yellowCardsVisitors));

    }
    /**
     * Buttons actions for Home
     */
    public void addOneGoalForHome(View V){
        scoreHome = scoreHome + 1;
        displayForHomeScore(scoreHome);
    }
    public void addOneRedCardForHome(View V){
        redCardsHome = redCardsHome + 1;
        displayForHomeRedCards(redCardsHome);
    }
    public void addOneYellowCardForHome(View V){
        yellowCardsHome = yellowCardsHome + 1;
        displayForHomeYellowCards(yellowCardsHome);
    }
    /**
     * Displays the given info for Home.
     */
    public void displayForHomeScore(int scoreHome) {
        TextView scoreView = (TextView) findViewById(R.id.team_home_score);
        scoreView.setText(String.valueOf(scoreHome));

    }
    public void displayForHomeRedCards(int redCardsHome) {
        TextView scoreView = (TextView) findViewById(R.id.home_red_cards);
        scoreView.setText(String.valueOf(redCardsHome));

    }
    public void displayForHomeYellowCards(int yellowCardsVisitors) {
        TextView scoreView = (TextView) findViewById(R.id.home_yellow_cards);
        scoreView.setText(String.valueOf(yellowCardsVisitors));
    }

}
