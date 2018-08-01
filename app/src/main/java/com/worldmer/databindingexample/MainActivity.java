package com.worldmer.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.worldmer.databindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        User user  = new User();
        user.setName("Yagnik");
        user.setSurName("Mer");
//        activityMainBinding.setUser(user);
       // activityMainBinding.textview.setText("binding object");
    }
}
