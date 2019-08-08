package com.billy.mvvm_sample;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.billy.mvvm_sample.activities.AnimationActivity;
import com.billy.mvvm_sample.activities.ExpressionActivity;
import com.billy.mvvm_sample.activities.LambdaActivity;
import com.billy.mvvm_sample.activities.ListActivity;
import com.billy.mvvm_sample.activities.SimpleActivity;
import com.billy.mvvm_sample.activities.TwoWayActivity;
import com.billy.mvvm_sample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    public class MainViewModel {
        public void onClick(View view){
            CharSequence msg = "Hello toast!";
            String p = view.getTag().toString();
            Toast.makeText(MainActivity.this,  view.getTag().toString(), Toast.LENGTH_SHORT).show();

            if (p.equals("Simple")){
                startActivity(new Intent(MainActivity.this, SimpleActivity.class));
            }else if (p.equals("TwoWay")){
                startActivity(new Intent(MainActivity.this, TwoWayActivity.class));
            }else if (p.equals("List"))
                startActivity(new Intent(MainActivity.this, ListActivity.class));
            else if(p.equals("Lambda"))
                startActivity(new Intent(MainActivity.this, LambdaActivity.class));
            else if(p.equals("Expression"))
                startActivity(new Intent(MainActivity.this, ExpressionActivity.class));
            else if(p.equals("Animation"))
                startActivity(new Intent(MainActivity.this, AnimationActivity.class));
        }

        public void onClickSimpleDemo(View view) {

        }
        public void onClickListDemo(View view) {
            //startActivity(new Intent(MainActivity.this, ListActivity.class));
        }
        public void onClickTwoWayDemo(View view) {
            //startActivity(new Intent(MainActivity.this, TwoWayActivity.class));
        }
        public void onClickExpressionDemo(View view) {
            //startActivity(new Intent(MainActivity.this, ExpressionActivity.class));
        }
        public void onClickAnimationDemo(View view) {
            //startActivity(new Intent(MainActivity.this, AnimationActivity.class));
        }
        public void onClickLambdaDemo(View view) {
            //startActivity(new Intent(MainActivity.this, LambdaActivity.class));
        }
        public void onClickInjectDemo(View view) {
//            if (DemoApplication.isTest) {
//                DataBindingUtil.setDefaultComponent(new ProductionComponent());
//            } else {
//                DataBindingUtil.setDefaultComponent(new TestComponent());
//            }
//            DemoApplication.isTest = !DemoApplication.isTest;
//            recreate();
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mBinding.setViewModel(new MainViewModel());
    }
}
