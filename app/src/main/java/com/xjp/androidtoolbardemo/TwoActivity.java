package com.xjp.androidtoolbardemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

/**
 * Description:
 * User: xjp
 * Date: 2015/6/17
 * Time: 9:49
 */

public class TwoActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ImageView imageView;
    private CollapsingToolbarLayout collapsingToolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        toolbar = findView(R.id.toolbar);
        setSupportActionBar(toolbar);
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setDisplayShowTitleEnabled(false);
//        actionBar.setDisplayHomeAsUpEnabled(true);


        collapsingToolbar =
                findView(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("CSDN废墟的树");

        imageView  =findView(R.id.image);
    }


    private <T extends View> T findView(int id) {
        return (T) findViewById(id);
    }
}
