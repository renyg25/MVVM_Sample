package com.billy.mvvm_sample.activities;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.billy.mvvm_sample.R;
import com.billy.mvvm_sample.databinding.ActivityLambdaBinding;
import com.billy.mvvm_sample.vmobjects.Employee;

public class LambdaActivity extends AppCompatActivity {

    private ActivityLambdaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_lambda);
        binding.setEmployee(new Employee("Android", "Studio"));
        binding.setViewModel(new LambdaViewModel());
    }

    public class LambdaViewModel{
        public void onEmployeeClick(Employee employee) {
            Toast.makeText(LambdaActivity.this, "onEmployeeClick",
                    Toast.LENGTH_SHORT).show();
        }

        public void onEmployeeLongClick(Employee employee, Context context) {
            Toast.makeText(LambdaActivity.this, "onEmployeeLongClick",
                    Toast.LENGTH_SHORT).show();
        }

        public void onFocusChange(Employee employee) {
            Toast.makeText(LambdaActivity.this, "onFocusChange",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
