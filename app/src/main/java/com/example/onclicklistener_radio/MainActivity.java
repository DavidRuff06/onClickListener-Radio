package com.example.onclicklistener_radio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void radioClick(View view) {
            TextView question = findViewById(R.id.question);
            boolean checked = ((RadioButton) view).isChecked();

            switch (view.getId()){
                case R.id.radio_one:
                    if(checked) {
                        question.setText("CELEBRATE!!!");
                    }
                    break;
                case R.id.radio_two:
                    if(checked) {
                        question.setText("Glad to hear it!!!");
                    }
                    break;
                case R.id.radio_three:
                    if(checked) {
                        question.setText("Take a deep breath\nit will all be ok");
                    }
                    break;
                case R.id.radio_four:
                    if(checked) {
                        question.setText("Go talk to a trusted\nadult");
                    }
                    break;

            }
        }
    }