package com.example.calendar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button YOMMASBUTTON = (Button)(findViewById(R.id.YOMAMASBUTTON));
//        YOMMASBUTTON.setOnClickListener(new View.OnClickListener() {
//            @Override
//                public void onClick(View v) {
//                Log.i(TAG, "Yo mama so fat she ate yo daddy's dick");
//            }
//        });
    }
    public void onClick(View v) {
        final String TAG = "Main activity";
        TextView tv = findViewById(R.id.textView22);
        Log.i(TAG, "textview 22 was clicked.");

        TextView tv2 = findViewById(R.id.textView23);
        Log.i(TAG, "textview 22 was clicked.");
    }
    
}
