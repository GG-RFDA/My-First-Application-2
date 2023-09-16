package com.example.myfirstapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
    // Создаём класс для переключения между экранами
    public void onStartButtonClick(View view) {
        // Далее указываем, куда нужно совершить переход
        Intent intent = new Intent(FirstActivity.this, MainActivity.class);
        // Используем метод startActivity для совершения перехода, где указываем имя
        startActivity(intent);
    }
}