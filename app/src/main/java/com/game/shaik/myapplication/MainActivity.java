package com.game.shaik.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    Button plus,minus;
    int no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         no=0;

         plus=findViewById(R.id.plus);


         Log.d("hello","This is inside create");

        minus=findViewById(R.id.minux);

        editText= findViewById(R.id.edittext);


        editText.setText(no+"");

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                no++;
                editText.setText(no+"");

                Log.e("hello",no+"");


            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(no>0)
                {    no--;
                editText.setText(no+"");}
            }
        });





    }

}
