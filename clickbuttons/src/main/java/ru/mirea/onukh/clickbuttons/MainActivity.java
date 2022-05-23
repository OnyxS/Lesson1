package ru.mirea.onukh.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button buttonOk;
    private Button buttonCancel;
    private TextView tvOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut=((TextView) findViewById(R.id.textView));
        buttonOk=((Button) findViewById(R.id.button));
        buttonCancel=((Button) findViewById(R.id.button2));
        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка ОК");
            }
        };
        // присвоим обработчик кнопке OK (btnOk)
        buttonOk.setOnClickListener(oclBtnOk);

        View.OnClickListener oclBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка Cancel");
            }
        };
        // присвоим обработчик кнопке OK (btnOk)
        buttonCancel.setOnClickListener(oclBtnCancel);
    }
}