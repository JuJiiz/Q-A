package com.jujiiz.testapp.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tvQNo, tvQuestionField;
    Button btnChoice1, btnChoice2, btnChoice3, btnChoice4;
    questionObjects questionObj;
    HashMap<String, List<String>> hm;
    Random random;
    List<String> keys;
    String randomKey;
    List<String> value;
    String[] ChoiceArray = new String[4];
    int RCL = 0, qNo = 0, qNoMAX = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        hm = questionObj.arrayList();
        random = new Random();
        keys = new ArrayList<String>(hm.keySet());
        Collections.shuffle(Arrays.asList(keys));
        randomQuestion();
    }

    private void init() {
        tvQNo = (TextView) findViewById(R.id.tvQNo);
        tvQuestionField = (TextView) findViewById(R.id.tvQuestionField);

        btnChoice1 = (Button) findViewById(R.id.btnChoice1);
        btnChoice2 = (Button) findViewById(R.id.btnChoice2);
        btnChoice3 = (Button) findViewById(R.id.btnChoice3);
        btnChoice4 = (Button) findViewById(R.id.btnChoice4);

        btnChoice1.setOnClickListener(this);
        btnChoice2.setOnClickListener(this);
        btnChoice3.setOnClickListener(this);
        btnChoice4.setOnClickListener(this);
    }

    private void randomQuestion() {
        randomKey = keys.get(qNo);
        //randomKey = keys.get(random.nextInt(keys.size()));
        value = hm.get(randomKey);

        Log.d("xxxxxxxxxx", String.valueOf(randomKey));
        Log.d("xxxxxxxxxx", String.valueOf(qNo));

        for (int i = 1; i <= 4; i++) {
            ChoiceArray[RCL] = value.get(i);
            Log.d("xxxxxxxxxx", ChoiceArray[RCL]);
            RCL++;
        }

        RCL = 0;

        Collections.shuffle(Arrays.asList(ChoiceArray));

        tvQNo.setText(qNo+1+"");
        tvQuestionField.setText(value.get(0));
        btnChoice1.setText(ChoiceArray[0]);
        btnChoice2.setText(ChoiceArray[1]);
        btnChoice3.setText(ChoiceArray[2]);
        btnChoice4.setText(ChoiceArray[3]);
    }

    @Override
    public void onClick(View v) {
        String C1 = btnChoice1.getText().toString();
        String C2 = btnChoice2.getText().toString();
        String C3 = btnChoice3.getText().toString();
        String C4 = btnChoice4.getText().toString();
        if(C1.equals(value.get(5)) || C2.equals(value.get(5)) || C3.equals(value.get(5)) || C4.equals(value.get(5))){
            if(qNo<=qNoMAX){
                qNo++;
                randomQuestion();
            }else{
                Toast.makeText(getApplicationContext(),"Ending",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
