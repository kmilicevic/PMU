package rs.etf.pmu.gui;

import java.util.LinkedList;
import java.util.List;

public class CustomAdapterModel {
    String languageName;
    String languageDescription;
    int languageIcon;

    public CustomAdapterModel(String languageName, String languageDescription, int languageIcon) {
        this.languageName = languageName;
        this.languageDescription = languageDescription;
        this.languageIcon = languageIcon;
    }

    public static List<CustomAdapterModel> createItems(String[] languageNames, String[] languageDescriptions, int[] languageIcons) {
        List<CustomAdapterModel> result = new LinkedList<>();
        for (int i = 0; i < languageNames.length; i++) {
            String name = languageNames[i];
            String description = languageDescriptions[i];
            int icon = languageIcons[i];
            CustomAdapterModel item = new CustomAdapterModel(name, description, icon);
            result.add(item);
        }
        return result;
    }
}

