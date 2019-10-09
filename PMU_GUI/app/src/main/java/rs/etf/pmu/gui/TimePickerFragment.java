package rs.etf.pmu.gui;

import java.util.*;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.*;
import android.text.format.*;

import androidx.fragment.app.*;


public class TimePickerFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        TimePickerDialog.OnTimeSetListener listener =
                (TimePickerDialog.OnTimeSetListener) getActivity();
        return new TimePickerDialog(getActivity(), listener, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }

}
