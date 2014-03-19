package com.danyalvarez.android.developer.tools;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.danyalvarez.android.developer.MainActivity;
import com.danyalvarez.android.developer.R;

/**
 * Created by daniel on 18/03/14.
 */
public class GeneratorImageResolutionFragment extends Fragment {

    private Context mContext;


    public GeneratorImageResolutionFragment(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_generator_image_resolution, container, false);



        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(1);
    }

}
