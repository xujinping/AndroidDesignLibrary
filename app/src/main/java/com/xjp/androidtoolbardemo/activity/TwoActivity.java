package com.xjp.androidtoolbardemo.activity;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.xjp.androidtoolbardemo.R;

/**
 * Description:
 * User: xjp
 * Date: 2015/6/17
 * Time: 9:49
 */

public class TwoActivity extends BaseActivity {

    private Toolbar toolbar;
    private CollapsingToolbarLayout collapsingToolbar;

    @Override
    protected int getContentView() {
        return R.layout.activity_two;
    }

    @Override
    protected void initView() {
        toolbar = findView(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        collapsingToolbar =
                findView(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("CSDN废墟的树");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
