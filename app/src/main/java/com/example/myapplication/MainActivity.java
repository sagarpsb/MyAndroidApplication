package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String tableText = "";

    public void buttonIsClicked(View view){
//        int result = 5 * 9;
//        Log.i("RESULT", result + "");
        TextView myTable = findViewById(R.id.table);

        EditText edtTxt = findViewById(R.id.edtText);
//        Log.i("NAME", edtName.getText().toString());
        for (int i = 1; i <= 10; i++){
            tableText = tableText + (i * Integer.parseInt(edtTxt.getText().toString())) + "\n";
        }

        myTable.setText(tableText);
//          EditText edtPhoneNumber = findViewById(R.id.edtPhoneNumber);
//          Log.i("PHONE", edtPhoneNumber.getText().toString());
//
//        Toast.makeText(MainActivity.this, "toast: " + edtPhoneNumber.getText().toString() ,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        Boxer myBoxer = new Boxer();

        Log.i("MyTag", new Boxer().kickSpeed + "");
    }
}
