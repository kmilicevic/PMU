package rs.etf.pmu.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutocompleteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autocomplete);

        setDaysValue();

        setCountriesValue();
    }

    private void setDaysValue() {
        AutoCompleteTextView textView = findViewById(R.id.autoCompleteTextView);

        String[] days = getResources().getStringArray(R.array.days);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, days);
        textView.setAdapter(arrayAdapter);
    }

    private void setCountriesValue() {
        AutoCompleteTextView textView = findViewById(R.id.autocomplete_country);

        String[] countries = getResources().getStringArray(R.array.countries_array);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);
        textView.setAdapter(arrayAdapter);
    }
}
