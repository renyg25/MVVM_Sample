package com.billy.mvvm_sample.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.billy.mvvm_sample.MainActivity;
import com.billy.mvvm_sample.R;
import com.billy.mvvm_sample.databinding.ActivityInclueViewBinding;
import com.billy.mvvm_sample.viewmodels.IncludeViewViewModel;

public class InclueViewActivity extends AppCompatActivity {

    private IncludeViewViewModel VM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityInclueViewBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_inclue_view);
        VM = new IncludeViewViewModel(this);
        binding.setVM(VM);
        //setContentView(R.layout.activity_inclue_view);
    }
}
