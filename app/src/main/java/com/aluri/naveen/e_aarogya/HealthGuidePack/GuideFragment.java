package com.aluri.naveen.e_aarogya.HealthGuidePack;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aluri.naveen.e_aarogya.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class GuideFragment extends Fragment {

    private final String android_version_names[] = {
            "Health Tips","Health Recipies","Nutrition Tips","Weight Loss Tips","Weight Gain Tips"
    };

    private final String android_image_urls[] =  {

            "https://pbs.twimg.com/profile_images/607463603881414656/eFZlqcuU.png",
            "https://is5-ssl.mzstatic.com/image/thumb/Purple3/v4/9a/1d/fe/9a1dfe77-708c-ec0a-3a4e-1c4433da1f46/source/256x256bb.jpg",
            "https://whatthehealthmag.files.wordpress.com/2013/11/foodquiz.png",
            "https://cdn2.iconfinder.com/data/icons/medical-services-2/256/Weight_Management-256.png",
            "http://www.muthafitness.co.uk/wp-content/uploads/2017/01/mutha-fitness-weight-loss-icon.png"
    };
    public GuideFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_guide, container, false);

        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        ArrayList ItemsData = prepareData();
        DataAdapter adapter = new DataAdapter(getContext(),ItemsData);
        recyclerView.setAdapter(adapter);

    return view;
    }
    private ArrayList prepareData(){

        ArrayList android_version = new ArrayList<>();
        for(int i=0;i<android_version_names.length;i++){
            ItemsData androidVersion = new ItemsData();
            androidVersion.setItem_name(android_version_names[i]);
            androidVersion.setItem_image_url(android_image_urls[i]);
            android_version.add(androidVersion);
        }
        return android_version;
    }
}
