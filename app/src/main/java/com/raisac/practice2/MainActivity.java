package com.raisac.practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int health =100/3;
    String percentage;
    Button yes, no, sometimes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int weekday =5;
        int weekend = 9;
        int optimalHours = 7*8;
        int actualHours = weekday;
        actualHours = actualHours + weekend * 2;
        int solution = optimalHours - actualHours;

        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        sometimes = findViewById(R.id.sometimes);


    }

    private void display(int solution) {
        percentage ="%";
        TextView show = findViewById(R.id.display_text_ieww);
        show.setText("" + health + percentage);

    }
    private void condition(int number){
        TextView condition = findViewById(R.id.condition);
        condition.setText("you are " + health +  "%" + "healthy");

    }

    public void yes(View view) {
        health = health + 100/3;
        condition(health);
        yes.setEnabled(false);
        display(health);
    }

    public void No(View view) {
        health = health - 100/3;
        condition(health);
        yes.setEnabled(true);
        no.setEnabled(false);
        display(health);
        sometimes.setEnabled(true);


    }

    public void sometimes(View view) {
        health = health;
        condition(health);
        yes.setEnabled(true);
        sometimes.setEnabled(false);
        no.setEnabled(true);
        display(health);

    }
}
