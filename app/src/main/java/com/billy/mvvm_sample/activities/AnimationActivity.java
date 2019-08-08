package com.billy.mvvm_sample.activities;

import android.databinding.DataBindingUtil;
import android.databinding.OnRebindCallback;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

import com.billy.mvvm_sample.R;
import com.billy.mvvm_sample.databinding.ActivityAnimationBinding;

public class AnimationActivity extends AppCompatActivity {

    ActivityAnimationBinding bindig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bindig = DataBindingUtil.setContentView(this, R.layout.activity_animation);
        bindig.addOnRebindCallhaltedback(new OnRebindCallback() {
            @Override
            public boolean onPreBind(ViewDataBinding binding) {
                ViewGroup view = (ViewGroup)binding.getRoot();
                TransitionManager.beginDelayedTransition(view);
                return true;
            }
        });
        bindig.setViewModel(new AnimationViewModel());
    }

    public class AnimationViewModel{
        public void onCheckedChanged(View view, boolean isChecked){
            bindig.setShowImage(isChecked);
        }
    }
}
