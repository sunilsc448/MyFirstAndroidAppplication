package com.example.android.myfirstapplication.app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sunil Kumar on 28-12-2015.// Edited by Bheemesh Jan27
 Sunil Commit 1 Rebase
  Sunil Commit 2 Rebase
 */
public class FragmentLogin extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Comments added for the purpose of rebasing
        return inflater.inflate(R.layout.login_fragment,container,false);
    }
}
