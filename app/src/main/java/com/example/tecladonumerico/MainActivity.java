package com.example.tecladonumerico;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TecladoNumerico";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configuramos todos los botones
        setupBotones();
    }

    private void setupBotones() {
        // Botones de números y operaciones
        int[] buttonIds = {
                R.id.buttonNumLock, R.id.buttonDivide, R.id.buttonMultiply, R.id.buttonMinus,
                R.id.button7, R.id.button8, R.id.button9, R.id.buttonPlus,
                R.id.button4, R.id.button5, R.id.button6,
                R.id.button1, R.id.button2, R.id.button3, R.id.buttonEnter,
                R.id.button0, R.id.buttonDot
        };

        for (int id : buttonIds) {
            Button button = findViewById(id);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Button b = (Button) v;
                    Log.i(TAG, "Botón pulsado: " + b.getText().toString());
                }
            });
        }
    }
}
