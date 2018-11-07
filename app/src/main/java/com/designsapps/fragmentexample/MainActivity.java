package com.designsapps.fragmentexample;



import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.designsapps.fragmentexample.fragments.frag1;
import com.designsapps.fragmentexample.fragments.frag2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment fragment;
        FragmentManager fm;
        FragmentTransaction ft;
        fragment = new frag1();
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        ft.replace(R.id.fragment,fragment);
        ft.commit();

    }

    public void frag2(View view) {
        try{
            Fragment fragment;
            FragmentManager fm;
            FragmentTransaction ft;
            fm = getSupportFragmentManager();
            ft = fm.beginTransaction();
            if(view.getId() == R.id.frag1){
                fragment = new frag2();
                ft.replace(R.id.fragment,fragment);
            }else{
                fragment = new frag1();
                ft.replace(R.id.fragment,fragment);
            }
            ft.commit();
        }catch (Exception e){
            Log.e("error2",e.getMessage());
        }
    }

}
