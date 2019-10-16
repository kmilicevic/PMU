package rs.etf.pmu.v3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MyViewModel myViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.textview);
        final Button button = findViewById(R.id.button);
        final Spinner spinner = findViewById(R.id.spinner);

        ArrayAdapter<String[]> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);

        String[] dataArray = new String[] {"Prvi", "Drugi", "Treci"};

        adapter.add(dataArray);
        spinner.setAdapter(adapter);

        myViewModel = ViewModelProviders
                .of(this)
                .get(MyViewModel.class);

        myViewModel.getLiveDataString().observe( this, new Observer<String>()
        {
            @Override
            public void onChanged(String value)
            {
                textView.setText(value);
            }
        });

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                myViewModel.userTextAdd("hardcoded");
                Intent intent = new Intent();
                intent.setClass( MainActivity.this, SecondActivity.class);
                startActivityForResult(intent, 101);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch (requestCode)
        {
            case 101:
                if (resultCode == RESULT_OK)
                {
                    myViewModel.userTextAdd(data.);
                }
        }
    }
}
