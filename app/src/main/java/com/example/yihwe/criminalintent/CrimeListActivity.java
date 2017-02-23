package com.example.yihwe.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by yihwe on 20-Feb-17.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
