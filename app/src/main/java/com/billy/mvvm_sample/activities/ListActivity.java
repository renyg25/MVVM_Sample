package com.billy.mvvm_sample.activities;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import com.billy.mvvm_sample.EmployeeAdapter;
import com.billy.mvvm_sample.R;
import com.billy.mvvm_sample.databinding.ActivityListBinding;
import com.billy.mvvm_sample.vmobjects.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListActivity extends AppCompatActivity {
    ActivityListBinding mBinding;
    EmployeeAdapter mEmployeeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_list);

        mBinding.setViewModel(new ListViewModel());

        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mEmployeeAdapter = new EmployeeAdapter(this);
        mBinding.recyclerView.setAdapter(mEmployeeAdapter);
        mEmployeeAdapter.setListener(new EmployeeAdapter.OnItemClickListener() {
            @Override
            public void onEmployeeClick(Employee employee) {
                Toast.makeText(ListActivity.this,
                        employee.getFirstName(), Toast.LENGTH_SHORT).show();
            }
        });
        List<Employee> demoList = new ArrayList<>();
        demoList.add(new Employee("Zhai", "Mark", false));
        demoList.add(new Employee("Zhai2", "Mark2", false));
        demoList.add(new Employee("Zhai3", "Mark3", true));
        demoList.add(new Employee("Zhai4", "Mark4", false));
        mEmployeeAdapter.addAll(demoList);
    }

    public class ListViewModel{
        int i = 1;
        public void onClickAddItem(View view) {
            mEmployeeAdapter.add(new Employee("haha", String.valueOf(i++)));
        }

        public void onClickRemoveItem(View view) {
            mEmployeeAdapter.remove();
        }

        public void onClickChangeItem(View view) {
            mEmployeeAdapter.edit();
        }
    }


}
