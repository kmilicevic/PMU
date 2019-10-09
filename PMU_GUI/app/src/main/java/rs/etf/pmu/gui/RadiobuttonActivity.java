package rs.etf.pmu.gui;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class RadiobuttonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton);

        setRadiobuttonListener();

    }

    protected void setRadiobuttonListener() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.radio1);
        radioButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });
    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio1:
                if (checked) {

                }
                break;
            case R.id.radio2:
                if (checked) {

                }
                break;
            case R.id.radio3:
                if (checked) {

                }
                break;
        }
    }

}
