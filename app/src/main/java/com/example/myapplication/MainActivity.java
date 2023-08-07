package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private EditText edittext1;
  private EditText editTextNUmber2;
  private EditText edittext2;
  private Button add;

  private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         edittext1=(EditText)findViewById(R.id.edittext1);
        edittext2=(EditText)findViewById(R.id.edittext2);
        add= (Button) findViewById(R.id.btnAdd);
        result=(TextView) findViewById(R.id.textAnswer);
     add.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             int number1= Integer.parseInt(edittext1.getText().toString());
             int number2= Integer.parseInt(edittext2.getText().toString());

             int sum = number1 +number2;
             result.setText("Answer:"+String.valueOf(sum));
         }



    });


    }
}
