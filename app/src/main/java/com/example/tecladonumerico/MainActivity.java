package com.example.tecladonumerico;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configurar botones y registrarlos para escuchar eventos
        setupBotones();
    }

    private void setupBotones() {
        int[] buttonIds = {
                R.id.buttonNumLock, R.id.buttonDivide, R.id.buttonMultiply, R.id.buttonMinus,
                R.id.button7, R.id.button8, R.id.button9, R.id.buttonPlus,
                R.id.button4, R.id.button5, R.id.button6,
                R.id.button1, R.id.button2, R.id.button3, R.id.buttonEnter,
                R.id.button0, R.id.buttonDot
        };

        for (int id : buttonIds) {
            Button button = findViewById(id);
            button.setOnClickListener(this); // Registra MainActivity como el listener
        }
    }

    @Override
    public void onClick(View v) {
        // Mostrar un Toast con el texto del botón pulsado
        Button button = (Button) v;
        Toast.makeText(this, "Botón pulsado: " + button.getText(), Toast.LENGTH_SHORT).show();
    }
}
