package com.billy.mvvm_sample.viewmodels;

import android.content.Context;
import android.databinding.ObservableField;
import android.view.View;

import com.billy.mvvm_sample.databinding.ActivityInclueViewBinding;

import java.util.Random;

public class IncludeViewViewModel {

    private Context mContext;

    public final ObservableField<String> name = new ObservableField<>();

    public IncludeViewViewModel(Context context){
        this.mContext = context;
    }

    public void onClick(View view){
        Random ran = new Random();
        name.set("Clicked: " + ran.nextInt());
    }
}
