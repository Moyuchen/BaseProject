package com.moyuchen.baseproject.base;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import com.moyuchen.baseproject.R;

/**
 * baseActivity
 */
public abstract class BaseActivity extends AppCompatActivity {
    public abstract int getLayoutId();//获取layout id
    public abstract void initView();//初始化view方法

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        initview();

    }

    private void initview(){
        FrameLayout content = findViewById(R.id.base_content);
        View contentView = LayoutInflater.from(this).inflate(getLayoutId(), null, false);
        content.addView(contentView);

    }
}
