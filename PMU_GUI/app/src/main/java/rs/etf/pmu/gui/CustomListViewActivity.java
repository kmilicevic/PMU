package rs.etf.pmu.gui;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class CustomListViewActivity extends AppCompatActivity {

    public static int[] languageIcons = {R.drawable.images0, R.drawable.images1, R.drawable.images2, R.drawable.images3, R.drawable.images4, R.drawable.images5, R.drawable.images6, R.drawable.images7, R.drawable.images8};
    public static String[] languageNames = {"C", "C++", "Java", "C#", ".Net", "PHP", "SQL", "JavaScript", "Python"};
    public static String[] languageDescriptions = {"C is ...", "C++ is ...", "Java is ...", "C# is ...", ".Net is ...", "PHP is ...", "SQL is ...", "JavaScript is ...", "Python is ..."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(
                new CustomAdapter(this,
                        CustomAdapterModel.createItems(languageNames, languageDescriptions, languageIcons)));
        setActionListener();
    }

    protected void setActionListener() {
        ListView listView = findViewById(R.id.listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CustomAdapterModel model =
                        (CustomAdapterModel) parent.getAdapter().getItem(position);

            }
        });
    }
}