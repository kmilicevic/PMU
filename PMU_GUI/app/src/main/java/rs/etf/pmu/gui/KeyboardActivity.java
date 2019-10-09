package rs.etf.pmu.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class KeyboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyboard);

//        setActionListener();

        setTextChangeListener();
    }

    protected void setActionListener() {
        EditText editText = findViewById(R.id.keyboardText);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                switch (actionId) {
                    case EditorInfo.IME_ACTION_GO:
                    case EditorInfo.IME_ACTION_SEARCH:
                    case EditorInfo.IME_ACTION_SEND:
                    case EditorInfo.IME_ACTION_NEXT:
                    case EditorInfo.IME_ACTION_PREVIOUS:
                    case EditorInfo.IME_ACTION_DONE:
                        sendMessage();
                        return true;
                }
                return false;
            }
        });
    }

    private void sendMessage() {
        EditText editText = findViewById(R.id.keyboardText);
        TextView textView = findViewById(R.id.enteredText);
        textView.setText(editText.getText().toString());
    }

    protected void setTextChangeListener() {
        final EditText editText = findViewById(R.id.keyboardText);
        final TextView textView = findViewById(R.id.enteredText);

        TextWatcher textWatcher = new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textView.setText(editText.getText().toString());
            }
        };
        editText.addTextChangedListener(textWatcher);
    }
}
