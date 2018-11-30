package com.aluri.naveen.e_aarogya.HealthGuidePack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.aluri.naveen.e_aarogya.R;

public class DessertsActivity extends AppCompatActivity {
WebView wvAboutUs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);
     final ListView listView = (ListView) findViewById(R.id.listView10);
        String[] values = new String[] {
                "Sugar-Free Gluten-Free Chocolate Cupcakes",
                "LEMON POLENTA CAKE",
                "Gluten-Free Angel Food Cake Recipe",
                "Gluten-Free, Dairy-Free Bananas Foster Loaf Cake",
                "Chocolate Panna Cotta Notta",
                "Gluten Free Upside Down Lemon Meringue Pie Recipe",
                "Raw Berry Blueberry Pudding & Pie Filling",
                "Chocolate Hazelnut Blender Pie",
                "Spicy Cherry-Chocolate Souffles"


        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                int itemPosition     = position;
                String itemValue    = (String)listView.getItemAtPosition(position);
/*

                if (position == 0) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/a.html");

                }
                if (position == 1) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/b.html");

                }
                if (position == 2) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/c.html");

                }
                if (position == 3) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/d.html");

                }
                if (position == 4) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/e.html");

                }
                if (position == 5) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/f.html");

                }
                if (position == 6) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/g.html");

                }
                if (position == 7) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/h.html");

                }
                if (position == 8) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/i.html");

                }
*/
            }

        });

    }
}