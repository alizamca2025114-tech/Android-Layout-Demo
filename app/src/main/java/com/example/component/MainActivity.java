package com.example.component;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnLinear, btnRelative, btnConstraint, btnFrame, btnScroll;
    FrameLayout layoutContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Connect buttons with activity_main.xml
        btnLinear = findViewById(R.id.btnLinear);
        btnRelative = findViewById(R.id.btnRelative);
        btnConstraint = findViewById(R.id.btnConstraint);
        btnFrame = findViewById(R.id.btnFrame);
        btnScroll = findViewById(R.id.btnScroll);

        layoutContainer = findViewById(R.id.layoutContainer);


        // LINEAR LAYOUT
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                layoutContainer.removeAllViews();

                getLayoutInflater().inflate(
                        R.layout.linear,
                        layoutContainer,
                        true
                );
            }
        });


        // RELATIVE LAYOUT
        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                layoutContainer.removeAllViews();

                getLayoutInflater().inflate(
                        R.layout.relative,
                        layoutContainer,
                        true
                );
            }
        });


        // CONSTRAINT LAYOUT
        btnConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                layoutContainer.removeAllViews();

                getLayoutInflater().inflate(
                        R.layout.constraint,
                        layoutContainer,
                        true
                );
            }
        });


        // FRAME LAYOUT
        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                layoutContainer.removeAllViews();

                getLayoutInflater().inflate(
                        R.layout.frame,
                        layoutContainer,
                        true
                );
            }
        });


        // SCROLL VIEW
        btnScroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                layoutContainer.removeAllViews();

                getLayoutInflater().inflate(
                        R.layout.scrollview,
                        layoutContainer,
                        true
                );
            }
        });
    }
}