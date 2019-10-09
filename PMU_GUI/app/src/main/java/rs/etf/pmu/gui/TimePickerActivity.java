package rs.etf.pmu.gui;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

public class TimePickerActivity extends AppCompatActivity implements
        TimePickerDialog.OnTimeSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
    }

    public void showNoticeDialog(View view) {
        DialogFragment dialog = new TimePickerFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        dialog.show(fragmentManager, "TimePicker");
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        TextView textView = findViewById(R.id.pickedTimeView);
        textView.setText("Hours: " + hourOfDay + ", minutes: " + minute);
    }
}