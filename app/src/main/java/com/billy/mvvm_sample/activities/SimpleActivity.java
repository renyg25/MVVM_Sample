package com.billy.mvvm_sample.activities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.billy.mvvm_sample.R;
import com.billy.mvvm_sample.databinding.ActivitySimpleBinding;
import com.billy.mvvm_sample.vmobjects.Employee;

public class SimpleActivity extends AppCompatActivity {

    private Employee employee = new Employee("Android", "Studio");
    private ActivitySimpleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_simple);
        binding.setEmployee(employee);
        binding.setViewModel(new SimpleViewModel());
    }

    public class SimpleViewModel{
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            employee.setFirstName(s.toString());
            //employee.setFired(!employee.isFired.get());
//            binding.setEmployee(employee);
        }

        public void onLastNameTextChanged(CharSequence s, int start, int before, int count){
            employee.setLastName(s.toString());
        }

        public void onClick(View view) {
            Toast.makeText(SimpleActivity.this, "点到了", Toast.LENGTH_SHORT).show();
        }

        public void onClickListenerBinding(Employee employee) {
            Toast.makeText(SimpleActivity.this, employee.getLastName(),
                    Toast.LENGTH_SHORT).show();
        }
    }
}
