package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Integer images[] = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3};
    private int currImage = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialImage();
        setImageRotateListener();
    }

    private void setImageRotateListener() {

        final Button rotatebutton = (Button) findViewById(R.id.btnRotateImage);
        rotatebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                currImage++;
                if (currImage == 3) {
                    currImage = 0;
                }
                setCurrentImage();
            }
        });
    }

    private void setInitialImage() {
        setCurrentImage();
    }
    private void setCurrentImage() {

        final ImageView imageView = (ImageView) findViewById(R.id.imageDisplay);
        imageView.setImageResource(images[currImage]);

    }
}
