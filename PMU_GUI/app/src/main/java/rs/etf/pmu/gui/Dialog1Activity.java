package rs.etf.pmu.gui;

import android.os.*;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.*;

public class Dialog1Activity extends AppCompatActivity implements
        Dialog1Fragment.TwoActionsDialogListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog1);
    }

    public void showNoticeDialog(View view) {
        DialogFragment dialog = new Dialog1Fragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        dialog.show(fragmentManager, "TestDialogFragment");
    }

    @Override
    public void onDialogPositiveClick(DialogFragment dialog) {
        TextView textView = findViewById(R.id.notificationView);
        textView.setText("OK action");
    }

    @Override
    public void onDialogNegativeClick(DialogFragment dialog) {
        TextView textView = findViewById(R.id.notificationView);
        textView.setText("Negative action");
    }
}