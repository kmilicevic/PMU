package rs.etf.pmu.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class TwoItemsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_items);

        //accessing button in runtime
        Button button = findViewById(R.id.button);

        //setRuntimeContent();

    }

    protected void setRuntimeContent() {
        //setting (entire) content in runtime
        TextView textView = new TextView(this);
        setContentView(textView);
        textView.setText("Runtime text view");
        textView.setId(R.id.button);
    }

}
