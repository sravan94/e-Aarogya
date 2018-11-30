package com.aluri.naveen.e_aarogya.HealthGuidePack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.aluri.naveen.e_aarogya.R;

import java.util.ArrayList;

public class HealthRecipie extends AppCompatActivity {

    private final String android_version_names[] = {
            "BREAKFAST","LUNCH","DINNER","SOUP & SALAD","SNACKES & SIDES","DESSERTS"
    };

    private final String android_image_urls[] =  {

            "http://wfarm2.dataknet.com/static/resources/icons/set9/f3fa786d348f.png",
            "http://20xxwiki.batterystaplegames.com/images/archive/d/d9/20160512221323%21Brain_Food_Lunch.png",
            "https://cdn-img.easyicon.net/png/5483/548336.gif",
            "http://downloadicons.net/sites/default/files/soup-icon-53582.png",
            "https://cdn1.iconfinder.com/data/icons/illustrative-palpable-food-drink/256/22_popcorn-256.png",
            "https://cdn4.iconfinder.com/data/icons/REALVISTA/food/png/256/strawberry_ice_cream.png"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_guide);


        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList androidVersions = prepareData();
        DataAdapter1 adapter = new DataAdapter1(this,androidVersions);
        recyclerView.setAdapter(adapter);
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
