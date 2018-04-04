package com.example.syl.android_design_patterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.syl.android_design_patterns.builder_example.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User.UserBuilder("Pitt", "Smith").age(24).phone("+34000000000").address("Address").build();

        System.out.println(user.toString());
    }
}
