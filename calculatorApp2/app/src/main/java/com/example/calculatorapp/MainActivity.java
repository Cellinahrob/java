package com.example.calculatorapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }
//         public void onButtonClick(View v) {
//             EditText e1 = (EditText)findViewById(R.id.editText1);
//             EditText e2 = (EditText)findViewById(R.id.editText3);
//             TextView t1 =(TextView)findViewById(R.id.textView);
//             int num1 = Integer.parseInt(e1.getText().toString());
//             int num2 =Integer.parseInt(e2.getText().toString());
//             int sum = num1 + num2;
//             t1.setText(Integer.toString(sum));}

    public void onButtonClick(View v){
        EditText e1 = (EditText)findViewById(R.id.number1);
        EditText e2 = (EditText)findViewById(R.id.number2);
        TextView t1 = (TextView)findViewById(R.id.result);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1 + num2;
        t1.setText(Integer.toString(sum));

    }
    public void onButton2Click(View v){
        EditText e1 = (EditText)findViewById(R.id.number1);
        EditText e2 = (EditText)findViewById(R.id.number2);
        TextView t1 = (TextView)findViewById(R.id.result);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int subtraction = num1 - num2;
        t1.setText(Integer.toString(subtraction));

    }
    public void onButton3Click(View v){
        EditText e1 = (EditText)findViewById(R.id.number1);
        EditText e2 = (EditText)findViewById(R.id.number2);
        TextView t1 = (TextView)findViewById(R.id.result);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int multiplication = num1 * num2;
        t1.setText(Integer.toString(multiplication));

    }
    public void onButton4Click(View v){
        EditText e1 = (EditText)findViewById(R.id.number1);
        EditText e2 = (EditText)findViewById(R.id.number2);
        TextView t1 = (TextView)findViewById(R.id.result);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int division = num1 / num2;
        t1.setText(Integer.toString(division));

    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
