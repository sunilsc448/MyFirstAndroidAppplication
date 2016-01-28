package com.example.android.myfirstapplication.app;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sunil Kumar on 28-12-2015. Changes done for rebase Bheemesh 
 */
public class FragmentSignup extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//Changes for rebase 1
        return inflater.inflate(R.layout.signup_fragment,container,false);
    }
}
