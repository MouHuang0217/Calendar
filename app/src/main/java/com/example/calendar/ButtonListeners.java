package com.example.calendar;


import android.app.TimePickerDialog;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
public class ButtonListeners extends FragmentActivity implements View.OnClickListener, TimePickerDialog.OnTimeSetListener {

    private static final int SOME_RES_ID = 1000;

    @Override
    public void onClick(View buttons) {
        switch (buttons.getId()){
            case R.id.reminderButton:
                Log.i("reminderButton", "is clicked");
                break;
            case R.id.shiftButton:
                Log.i("shiftButton", "is clicked");
                DialogFragment timePicker = new TimePickerFragment();
                timePicker.show(getSupportFragmentManager(), "timepicker");
               /* if (!isFinishing() && !isDestroyed()) {
                    FragmentTransaction ft = getSupportFragmentManager()
                            .beginTransaction();
                    ft.replace(SOME_RES_ID, timePicker);
                    ft.commit();

                    timePicker.show(ft, "time");
                }*/
               // }

            }
        }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        TextView textView = (TextView) findViewById(R.id.DateSelectedText);
    }
    void showMyDialog() {

    }
}
