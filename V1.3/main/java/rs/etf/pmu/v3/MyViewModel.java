package rs.etf.pmu.v3;

import android.os.Bundle;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {


    MutableLiveData<String> mutableLiveData;

    public MyViewModel()
    {
        mutableLiveData = new MutableLiveData<>( "Initial");
    }

    public LiveData<String> getLiveDataString()
    {
        return mutableLiveData;
    }

    public void userTextAdd(String text)
    {
        mutableLiveData.setValue(
                mutableLiveData.getValue()+" "+text
        );
    }
}
