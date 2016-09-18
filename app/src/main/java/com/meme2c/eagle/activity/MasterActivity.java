package com.meme2c.eagle.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.meme2c.eagle.R;

import butterknife.ButterKnife;

public class MasterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);
        ButterKnife.bind(this);

    }


}
