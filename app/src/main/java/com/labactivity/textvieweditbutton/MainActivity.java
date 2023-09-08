package com.labactivity.textvieweditbutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText lastNameInput;
    private EditText firstNameInput;
    private EditText middleInitialInput;
    private Button sendButton;
    private TextView bodyTxt;
    private Button pinkButton;
    private Button blueButton;
    private Button greenButton;
    private Button size34Button;
    private Button size24Button;
    private Button size20Button;
    private Button welcomeButton;
    private Button congratsButton;
    private Button niceButton;

    private String fullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lastNameInput = findViewById(R.id.editTextTextPersonName);
        firstNameInput = findViewById(R.id.editTextTextPersonName2);
        middleInitialInput = findViewById(R.id.editTextTextPersonName3);
        sendButton = findViewById(R.id.button);
        bodyTxt = findViewById(R.id.textView);
        pinkButton = findViewById(R.id.button3);
        blueButton = findViewById(R.id.button2);
        greenButton = findViewById(R.id.button4);
        size34Button = findViewById(R.id.button5);
        size24Button = findViewById(R.id.button6);
        size20Button = findViewById(R.id.button7);
        welcomeButton = findViewById(R.id.button8);
        congratsButton = findViewById(R.id.button9);
        niceButton = findViewById(R.id.button10);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lastName = lastNameInput.getText().toString();
                String firstName = firstNameInput.getText().toString();
                String middleInitial = middleInitialInput.getText().toString();

                fullName = firstName + " " + middleInitial + " " + lastName;
                bodyTxt.setText("Welcome \n" + fullName);
            }
        });

        pinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bodyTxt.setTextColor(getResources().getColor(R.color.pink));
            }
        });

        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bodyTxt.setTextColor(getResources().getColor(R.color.blue));
            }
        });

        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bodyTxt.setTextColor(getResources().getColor(R.color.green));
            }
        });

        size34Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bodyTxt.setTextSize(34);
            }
        });

        size24Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bodyTxt.setTextSize(24);
            }
        });

        size20Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bodyTxt.setTextSize(20);
            }
        });

        welcomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bodyTxt.setText("Welcome \n" + fullName);
            }
        });

        congratsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bodyTxt.setText("Congratulations \n" + fullName);
            }
        });

        niceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bodyTxt.setText("Have a Nice Day \n" + fullName);
            }
        });
    }
}
