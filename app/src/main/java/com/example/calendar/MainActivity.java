package com.example.calendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final String TAG = "Main activity";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button YOMMASBUTTON = (Button)(findViewById(R.id.YOMAMASBUTTON));
//        YOMMASBUTTON.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG, "Yo mama so fat she ate yo daddy's dick");
//            }
//        });
    }
    
}
