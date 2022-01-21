package com.psp.bottomsheet_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btnOpenBottomSheet;

    private MyBottomSheet bottomSheet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpenBottomSheet = findViewById(R.id.btnOpenBottomSheet);


        btnOpenBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                // Bottom sheet
                bottomSheet = new MyBottomSheet();
                bottomSheet.show(getSupportFragmentManager(),bottomSheet.getTag());
            }
        });
    }


    @Override
    protected void onPause() {
        if(bottomSheet != null) {
            bottomSheet.dismiss();
            bottomSheet = null;
        }
        super.onPause();
    }
}