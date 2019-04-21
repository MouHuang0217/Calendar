package com.example.calendar;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialCalendarView calendar = findViewById(R.id.calendarView);
        calendar.setOnDateChangedListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(@NonNull MaterialCalendarView widget, @NonNull CalendarDay date, boolean selected) {
                TextView textView = findViewById(R.id.textView2);
                String month = Integer.toString(date.getMonth() + 1);
                String year = Integer.toString(date.getYear());
                String day = Integer.toString(date.getDay());
                String formatedDate = (String.format(Locale.getDefault(), "%s - %s - %s", month, day, year));
                textView.setText("DatePicked: " + formatedDate);
                //Toast.makeText(MainActivity.this, "" + formatedDate, Toast.LENGTH_SHORT).show();

                Button button1 = findViewById(R.id.button);
                button1.setVisibility(View.VISIBLE);
                Button button2 = findViewById(R.id.button2);
                button2.setVisibility(View.VISIBLE);
            }
        });

    }


}
