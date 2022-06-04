package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GLSurfaceView openGlView;
        OpenGlRenderer glRenderer = new OpenGlRenderer();

        openGlView = findViewById(R.id.openGl);
        openGlView.setRenderer(glRenderer);

    }

}