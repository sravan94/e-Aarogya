package com.aluri.naveen.e_aarogya.HealthGuidePack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.aluri.naveen.e_aarogya.R;

public class LunchActivity extends AppCompatActivity {
ListView listView;
    WebView wvAboutUs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
        listView = (ListView) findViewById(R.id.listView7);
        String[] values = new String[] {
                "Twice-Baked Broccoli-and-Kale-Stuffed Potatoes",
                "Zucchini Noodles With Leek-Tomato Sauce",
                "Mushroom-Stuffed Cabbage Rolls",
                "Quick and Easy Veggie Chili",
                "Butternut Squash, Chickpea, and Kale Curry",
                "Kale, Red Pepper, and Broccoli Spread Roll-Up",
                "Cheesy Stuffed Tomatoes",
                "Lentil and Goat Cheese Casserole",
                "Lentils With Roasted Beets and Carrots",
                "Quinoa With Broccoli-Avocado Pesto",
                "Mexican Style Sweet Potatoes",
                "Whole-Wheat Rigatoni With Greens",
                "Kelp Noodles With Almond-Ginger Dressing",
                "Whole-Wheat Linguine with Asparagus and Lemon",
                "Pesto Cheese Pizza",
                "Fresh Fig and Onion Flatbread Pizza"
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
                    wvAboutUs.loadUrl("file:///android_asset/01.html");

                }
                if (position == 1) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/02.html");

                }
                if (position == 2) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/03.html");

                }
                if (position == 3) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/04.html");

                }
                if (position == 4) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/05.html");

                }
                if (position == 5) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/06.html");

                }
                if (position == 6) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/07.html");

                }
                if (position == 7) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/08.html");

                }
                if (position == 8) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/09.html");

                }
                if (position == 9) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/010.html");

                }
                if (position == 10) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/011.html");

                }
                if (position == 11) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/012.html");

                }
                if (position == 12) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/013.html");

                }
                if (position == 13) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/014.html");

                }
                if (position == 14) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/015.html");

                }
                if (position == 15) {
                    setContentView(R.layout.activity_ummy);
                    wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                    wvAboutUs.loadUrl("file:///android_asset/016.html");

                }
                */
            }

        });

    }
}
