package com.example.v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

class MainActivity extends AppCompatActivity {

    private static final String LIFECYCLE_TAG = "NAS CIKLUS";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d( LIFECYCLE_TAG, "onCreate()" );
        final EditText editText1 = findViewById(R.id.edit_text_1);
        final EditText editText2 = findViewById(R.id.edit_text_2);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int broj1 = Integer.parseInt( editText1.getText().toString() );
                int broj2 = Integer.parseInt( editText2.getText().toString() );

            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d( LIFECYCLE_TAG, "onStart()" );
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d( LIFECYCLE_TAG, "onResume()" );
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d( LIFECYCLE_TAG, "onPause()" );
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d( LIFECYCLE_TAG, "onStop()" );
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d( LIFECYCLE_TAG, "onDestroy()" );
    }
}
