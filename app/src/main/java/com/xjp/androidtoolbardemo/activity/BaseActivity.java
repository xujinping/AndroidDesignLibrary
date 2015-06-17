package com.xjp.androidtoolbardemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Description:Activity基础类
 * User: xjp
 * Date: 2015/6/17
 * Time: 16:54
 */

public abstract class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        initView();
    }

    /**
     * 查找view
     */
    protected <T extends View> T findView(int id) {
        return (T) findViewById(id);
    }

    /**
     * 加载布局
     *
     * @return
     */
    protected abstract int getContentView();

    /**
     * 初始化view
     */
    protected abstract void initView();

}
