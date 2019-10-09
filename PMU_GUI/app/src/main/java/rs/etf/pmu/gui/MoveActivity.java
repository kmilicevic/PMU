package rs.etf.pmu.gui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Locale;

import rs.etf.pmu.gui.R;

public class MoveActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

        setTouchListener();
    }

    private void setTouchListener() {
        ConstraintLayout layout = findViewById(R.id.relativeLayout);

        layout.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent m) {
                // handleTouch(m);
                handleTouch1(m);
                return true;
            }
        });
    }

    void handleTouch(MotionEvent event) {
        int pointerCount = event.getPointerCount();
        TextView textView0 = findViewById(R.id.textView0);
        TextView textView1 = findViewById(R.id.textView1);
        for (int i = 0; i < pointerCount; i++) {
            int x = (int) event.getX(i);
            int y = (int) event.getY(i);
            int id = event.getPointerId(i);
            int action = event.getActionMasked();
            int actionIndex = event.getActionIndex();
            String actionString;

            switch (action) {
                case MotionEvent.ACTION_DOWN:
                    actionString = "DOWN";
                    break;
                case MotionEvent.ACTION_UP:
                    actionString = "UP";
                    break;
                case MotionEvent.ACTION_POINTER_DOWN:
                    actionString = "POINTER DOWN";
                    break;
                case MotionEvent.ACTION_POINTER_UP:
                    actionString = "POINTER UP";
                    break;
                case MotionEvent.ACTION_MOVE:
                    actionString = "MOVE";
                    break;
                default:
                    actionString = "";
            }
            String touchStatus = "Action: " + actionString +
                    " Index: " + actionIndex + " ID: " + id + " X: " + x + " Y: " + y;

            if (id == 0) textView0.setText(touchStatus);
            else textView1.setText(touchStatus);
        }
    }

    boolean handleTouch1(MotionEvent event) {
        final int historySize = event.getHistorySize();
        final int pointerCount = event.getPointerCount();
        StringBuilder builder = new StringBuilder();
        for (int h = 0; h < historySize; h++) {
            builder.append(String.format(Locale.getDefault(), "At time %d:", event.getHistoricalEventTime(h)));
            for (int p = 0; p < pointerCount; p++) {
                builder.append(String.format(Locale.getDefault(), " pointer %d: (%f,%f)", event.getPointerId(p),
                        event.getHistoricalX(p, h), event.getHistoricalY(p, h)));
            }
        }
        builder.append(String.format(Locale.getDefault(), "At time %d:", event.getEventTime()));
        for (int p = 0; p < pointerCount; p++) {
            builder.append(String.format(Locale.getDefault(), " pointer %d: (%f,%f)", event.getPointerId(p),
                    event.getX(p), event.getY(p)));
        }

        String touchStatus = builder.toString();
        TextView textView0 = findViewById(R.id.textView0);
        textView0.setText(touchStatus);
        System.out.println(touchStatus);
        return true;
    }

}
