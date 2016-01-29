package com.aamirislam.questiontemplate1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    private Button btA, btB, btC, btD, btE;
    private TextView txtA, txtB, txtC, txtD, txtE;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btA = (Button) findViewById(R.id.aButton);
        btB = (Button) findViewById(R.id.bButton);
        btC = (Button) findViewById(R.id.cButton);
        btD = (Button) findViewById(R.id.dButton);
        btE = (Button) findViewById(R.id.eButton);

        txtA = (TextView) findViewById(R.id.answerA);
        txtB = (TextView) findViewById(R.id.answerB);
        txtC = (TextView) findViewById(R.id.answerC);
        txtD = (TextView) findViewById(R.id.answerD);
        txtE = (TextView) findViewById(R.id.answerE);

        btA.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                txtA.setTextColor(Color.RED);
                txtB.setTextColor(Color.BLACK);
                txtC.setTextColor(Color.BLACK);
                txtD.setTextColor(Color.BLACK);
                txtE.setTextColor(Color.BLACK);
            }
        });
        btB.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                txtA.setTextColor(Color.BLACK);
                txtB.setTextColor(Color.RED);
                txtC.setTextColor(Color.BLACK);
                txtD.setTextColor(Color.BLACK);
                txtE.setTextColor(Color.BLACK);
            }
        });
        btC.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                txtA.setTextColor(Color.BLACK);
                txtB.setTextColor(Color.BLACK);
                txtC.setTextColor(Color.GREEN);
                txtD.setTextColor(Color.BLACK);
                txtE.setTextColor(Color.BLACK);
            }
        });
        btD.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                txtA.setTextColor(Color.BLACK);
                txtB.setTextColor(Color.BLACK);
                txtC.setTextColor(Color.BLACK);
                txtD.setTextColor(Color.RED);
                txtE.setTextColor(Color.BLACK);
            }
        });
        btE.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                txtA.setTextColor(Color.BLACK);
                txtB.setTextColor(Color.BLACK);
                txtC.setTextColor(Color.BLACK);
                txtD.setTextColor(Color.BLACK);
                txtE.setTextColor(Color.RED);
            }
        });

    }




    }

