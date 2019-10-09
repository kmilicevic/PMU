package rs.etf.pmu.gui;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

public class DatePickerActivity extends AppCompatActivity
        implements DatePickerDialog.OnDateSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
    }

    public void showNoticeDialog(View view) {
        DialogFragment dialog = new DatePickerFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        dialog.show(fragmentManager, "DatePicker");
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        TextView textView = findViewById(R.id.pickedDateView);
        textView.setText("Year: " + year + ", month: " + (1 + month) + ", day: " + dayOfMonth);
    }
}