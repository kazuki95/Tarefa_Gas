package com.example.tarefa_gas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void compare(View view) {
     TextView text = findViewById(R.id.resultado);

        EditText gasnum = findViewById(R.id.gas);
        EditText alcoolnum = findViewById(R.id.alcool);

        Float gas = Float.parseFloat(gasnum.getText().toString());
        Float alcool = Float.parseFloat(alcoolnum.getText().toString());



     if(alcool >= gas)
     {
text.setText("Gasolina");
}
     else{
             text.setText("Álcool");
}
    }
}