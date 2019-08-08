package com.billy.mvvm_sample.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.billy.mvvm_sample.R;
import com.billy.mvvm_sample.databinding.ActivityExpressionBinding;
import com.billy.mvvm_sample.vmobjects.Employee;

public class ExpressionActivity extends AppCompatActivity {

    private ActivityExpressionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_expression);
        Employee employee = new Employee("Android", "Studio", true);
        employee.setAvatar("https://avatars2.githubusercontent.com/u/1106500?v=3&s=460");
        binding = DataBindingUtil.setContentView(this, R.layout.activity_expression);
        binding.setEmployee(employee);
    }
}
