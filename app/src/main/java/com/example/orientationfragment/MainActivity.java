package com.example.orientationfragment;

import android.nfc.Tag;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Fragment1 fragment1;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        fragment1 = (Fragment1) fragmentManager.findFragmentByTag("TagFrag1");
        if (fragment1 == null) {
            fragment1 = new Fragment1();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.frag_container, fragment1, "TagFrag1");
            fragmentTransaction.commit();
        }

    }
}
