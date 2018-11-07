package com.designsapps.fragmentexample;

import android.content.res.Configuration;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.designsapps.fragmentexample.fragments.frag1;
import com.designsapps.fragmentexample.fragments.frag2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Configuration config = getResources().getConfiguration();
        FragmentManager fragmentManager  = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if(config.orientation == Configuration.ORIENTATION_LANDSCAPE){
            frag1 frag1 = new frag1();
            fragmentTransaction.replace(android.R.id.content,frag1);
        }else{
            frag2 frag2 = new frag2();
            fragmentTransaction.replace(android.R.id.content,frag2);
        }
        fragmentTransaction.commit();
    }
}
