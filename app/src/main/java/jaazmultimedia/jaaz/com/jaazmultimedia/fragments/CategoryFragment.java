package jaazmultimedia.jaaz.com.jaazmultimedia.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import jaazmultimedia.jaaz.com.jaazmultimedia.R;

/**
 * Created by Sumon on 5/13/2017.
 */
public class CategoryFragment extends Fragment {
    Activity activity;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        activity = getActivity();
        return view;
    }
}
