package com.billy.mvvm_sample.activities;

import android.database.DatabaseUtils;
import android.databinding.DataBindingUtil;
import android.databinding.Observable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.billy.mvvm_sample.R;
import com.billy.mvvm_sample.databinding.ActivityTwoWayBinding;
import com.billy.mvvm_sample.vmobjects.FormModel;

public class TwoWayActivity extends AppCompatActivity {

    private ActivityTwoWayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_two_way);

        FormModel model = new FormModel("user", "psd");
        model.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                Toast.makeText(TwoWayActivity.this, String.valueOf(propertyId), Toast.LENGTH_SHORT).show();
            }
        });
        binding.setModel(model);
    }

}
