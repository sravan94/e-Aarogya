package com.aluri.naveen.e_aarogya.HealthGuidePack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.aluri.naveen.e_aarogya.R;

public class DinnerActivity extends AppCompatActivity {
ListView listView;
    WebView wvAboutUs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);
        listView = (ListView) findViewById(R.id.listView6);
        String[] values = new String[] {
                "  CHICKEN BREAST WITH SHAVED BRUSSELS SPROUTS",
                " BARLEY-STUFFED POBLANOS ",
                "BURGER WITH MUSHROOMS AND RADICCHIO  ",
                " GRAPEFRUIT AND AVOCADO SALAD WITH SEARED SALMON ",
                " BROWN RICE BOWL WITH TURKEY ",
                " SPAGHETTI WITH WILTED GREENS AND WALNUT-PARSLEY PESTO ",
                " SWEET POTATO AND SPINACH QUESADILLAS ",
                " VEGETABLE MEATLOAF WITH BALSAMIC GLAZE ",
                " LEMON-GARLIC SHRIMP AND GRITS ",
                " STUFFED CHICKEN DIVAN WITH A SHERRY DIJON SAUCE ",

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
                    wvAboutUs.loadUrl("file:///android_asset/aa.html");

                }
                if (position == 1) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/bb.html");

                }
                if (position == 2) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/cc.html");

                }
                if (position == 3) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/dd.html");

                }
                if (position == 4) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/ee.html");

                }
                if (position == 5) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/ff.html");

                }
                if (position == 6) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/gg.html");

                }
                if (position == 7) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/hh.html");

                }
                if (position == 8) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/ii.html");

                }
                if (position == 9) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/jj.html");

                }
*/
            }

        });

    }
}
