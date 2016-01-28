package com.example.android.myfirstapplication.app;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.android.myfirstapplication.app.models.FragmentType;


/**
 * Created by Sunil Kumar on 24-12-2015.// Changes for rebase commit 2nd
 */
public class LandingActivity extends Activity {
    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);

        SetVisibility(FragmentType.login);
    }

    @Override
    public void onBackPressed() {

        FragmentManager fragmentManager = getFragmentManager();

        if(fragmentManager.getBackStackEntryCount()>0)
            fragmentManager.popBackStack();
        else
            super.onBackPressed();
    }

    private void SetVisibility(FragmentType login) {
        Fragment fr = null;
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        switch (login) {
            case login:
                fr = new FragmentLogin();
                break;
            case signup:
                fragmentTransaction.addToBackStack("fragmentsignup");
                fr = new FragmentSignup();
                break;
        }

        fragmentTransaction.replace(R.id.fragment_manager, fr);
        fragmentTransaction.commit();
    }

    public void LoginBtnClicked(View view)
    {
        Intent intnt = new Intent(this,MainActivity.class);
        startActivity(intnt);
        overridePendingTransition(R.anim.sample_anim,R.anim.sample_anim);
    }

    public void DontHaveAccountClicked(View view)
    {
        SetVisibility(FragmentType.signup);
    }
}

