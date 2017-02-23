package com.example.yihwe.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {

    //public static final String EXTRA_CRIME_ID = "com.example.yihwe.criminalintent.crime_id";
    private static final String EXTRA_CRIME_ID = "com.example.yihwe.criminalintent.crime_id";

    public static Intent newIntent (Context packageContext, UUID crimeId){
        Intent intent = new Intent(packageContext, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        UUID crimeId = (UUID) getIntent().getSerializableExtra(EXTRA_CRIME_ID);
        return CrimeFragment.newInstance(crimeId);
    }
    //@Override
    //protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_fragment);
        //FragmentManager fm = getSupportFragmentManager();
        //Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        //if(fragment == null){
            //fragment = new CrimeFragment();
            //fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        //}
}
