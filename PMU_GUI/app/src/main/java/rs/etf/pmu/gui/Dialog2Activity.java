package rs.etf.pmu.gui;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

public class Dialog2Activity extends AppCompatActivity implements
        Dialog1Fragment.TwoActionsDialogListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog1);
    }

    public void showNoticeDialog(View view) {
        DialogFragment dialog = new Dialog2Fragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        dialog.show(fragmentManager, "TestDialogFragment");
    }

    @Override
    public void onDialogPositiveClick(DialogFragment dialog) {
        TextView textView = findViewById(R.id.notificationView);
        EditText editText = dialog.getDialog().findViewById(R.id.username);
        textView.setText("Welcome: " + editText.getText().toString());
    }

    @Override
    public void onDialogNegativeClick(DialogFragment dialog) {
        TextView textView = findViewById(R.id.notificationView);
        textView.setText("Cancel action");
    }
}