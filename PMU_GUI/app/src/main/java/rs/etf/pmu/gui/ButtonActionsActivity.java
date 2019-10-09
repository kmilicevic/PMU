package rs.etf.pmu.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ButtonActionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_actions);

        setButtonListener();
    }

    protected void setButtonListener() {
        Button button = findViewById(R.id.testButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button) v;
                button.setText("Another Text");
            }
        });
    }

    public void clickAction(View view) {
        Button button = (Button) view;
        button.setText("New Text");
    }

}
