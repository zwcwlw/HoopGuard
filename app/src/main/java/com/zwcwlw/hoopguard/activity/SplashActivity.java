package com.zwcwlw.hoopguard.activity;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.zwcwlw.hoopguard.R;
import com.zwcwlw.hoopguard.utils.PackageUtil;

import static android.R.attr.version;

public class SplashActivity extends Activity {

    private TextView version;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initViews();
        initDate();
    }

    private void initDate() {
        version.setText("版本号：" + PackageUtil.getPackageVersion(this));
    }

    private void initViews() {
        version = (TextView) findViewById(R.id.tv_version);
    }
}
