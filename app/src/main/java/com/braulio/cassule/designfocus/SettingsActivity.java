package com.braulio.cassule.designfocus;

import android.os.Bundle;
import android.view.View;


public class SettingsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

    }
    public void close(View v){
        finish();
    }

}
