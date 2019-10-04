package com.example.jumbled;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView i1,i2, i3;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        i1 = findViewById(R.id.imageView7);
        i2 =findViewById(R.id.imageView8);
        i3 = findViewById(R.id.imageView9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i1.setX(388);
                i1.setY(129);
                i2.setX(79);
                i2.setY(438);
                i3.setX(388);
                i3.setY(438);
            }
        });
    }
}
