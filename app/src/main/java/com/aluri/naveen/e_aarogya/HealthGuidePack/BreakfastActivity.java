package com.aluri.naveen.e_aarogya.HealthGuidePack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.aluri.naveen.e_aarogya.R;

public class BreakfastActivity extends AppCompatActivity {
    ListView listView;
    private WebView wvAboutUs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);

        listView = (ListView) findViewById(R.id.listView5);
        String[] values = new String[] {

                "apple and  almond cereal","Quinoa Breakfast Bake","Whole-Wheat Zucchini Muffins","Breakfast Polenta With Honey and Yogurt",
                "Chocolate Banana Breakfast Quinoa","The Perfect Green Juice","Fruit Salad With Lemon-Lavender Syrup",
                "Fruit and Nut Bars","Pumpkin Pie Oatmeal","Easy Coconut Granola","Red White and Blue Parfait",
                "Banana and Cream Cheese Stuffed French Toast"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                int itemPosition     = position;
                String itemValue    = (String)listView.getItemAtPosition(position);


                if (position == 0) {
                    //code specific to first list item
                    //  Intent myIntent = new Intent(view.getContext(), ummy.class);
                    //  startActivityForResult(myIntent, 0);

                  //  setContentView(R.layout.activity_ummy);
                 //   wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                 //   wvAboutUs.loadUrl("file:///android_asset/1.html");


                }
                if (position == 1) {
                    //code specific to first list item
                    // Intent myIntent = new Intent(view.getContext(), LunchActivity.class);
                    //startActivityForResult(myIntent, 1);

                  //  setContentView(R.layout.activity_ummy);
                  //  wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                  //  wvAboutUs.loadUrl("file:///android_asset/2.html");
                }
                if (position == 2) {
                    //code specific to first list item
                    // Intent myIntent = new Intent(view.getContext(), DinnerActivity.class);
                    // startActivityForResult(myIntent, 2);
                 //   setContentView(R.layout.activity_ummy);
                 //   wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                 //   wvAboutUs.loadUrl("file:///android_asset/3.html");
                }
                if (position == 3) {
                    //code specific to first list item
                    //   Intent myIntent = new Intent(view.getContext(), SoupActivity.class);
                    //  startActivityForResult(myIntent, 3);
                   // setContentView(R.layout.activity_ummy);
                   // wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                   // wvAboutUs.loadUrl("file:///android_asset/4.html");
                }
                if (position == 4) {
                    //code specific to first list item
                    // Intent myIntent = new Intent(view.getContext(), SnacksActivity.class);
                    // startActivityForResult(myIntent, 4);
                   // setContentView(R.layout.activity_ummy);
                   // wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                   // wvAboutUs.loadUrl("file:///android_asset/5.html");
                }
                if (position == 5) {
                 //   setContentView(R.layout.activity_ummy);
                 //   wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                 //   wvAboutUs.loadUrl("file:///android_asset/6.html");

                }
                if (position == 6) {

                   // setContentView(R.layout.activity_ummy);
                  //  wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                  //  wvAboutUs.loadUrl("file:///android_asset/7.html");
                }
                if (position == 7) {
                 //   setContentView(R.layout.activity_ummy);
                 //   wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                 //   wvAboutUs.loadUrl("file:///android_asset/8.html");

                }
                if (position == 8) {

                  //  setContentView(R.layout.activity_ummy);
                  //  wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                  //  wvAboutUs.loadUrl("file:///android_asset/10.html");
                }
                if (position == 9) {

               //     setContentView(R.layout.activity_ummy);
               //     wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                //    wvAboutUs.loadUrl("file:///android_asset/11.html");
                }
                if (position == 10) {
                   // setContentView(R.layout.activity_ummy);
                  //  wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                  //  wvAboutUs.loadUrl("file:///android_asset/12.html");

                }
                if (position == 11) {
                 //   setContentView(R.layout.activity_ummy);
                  //  wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);
                  //  wvAboutUs.loadUrl("file:///android_asset/13.html");

                }



            }

        });

    }

}