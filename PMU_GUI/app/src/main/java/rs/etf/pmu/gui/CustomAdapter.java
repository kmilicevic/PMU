package rs.etf.pmu.gui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<CustomAdapterModel> {

    public CustomAdapter(Context context, List<CustomAdapterModel> items) {
        super(context, R.layout.program_list, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CustomAdapterModel item = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(
                    getContext()).inflate(R.layout.program_list, parent, false);
        }
        TextView languageName = convertView.findViewById(R.id.languageName);
        languageName.setText(item.languageName);
        TextView description = convertView.findViewById(R.id.languageDescription);
        description.setText(item.languageDescription);
        ImageView languageIcon = convertView.findViewById(R.id.languageIcon);
        languageIcon.setImageResource(item.languageIcon);
        return convertView;
    }

}
