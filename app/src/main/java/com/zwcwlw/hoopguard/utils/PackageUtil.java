package com.zwcwlw.hoopguard.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/**
 * Created by zwcwlw on 2017/2/20.
 */

public class PackageUtil {
    public static String getPackageVersion(Context context){
        try {
            PackageInfo pi=context.getPackageManager().getPackageInfo(context.getPackageName(),0);
            String version=pi.versionName;
            return version;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return"解析失败";
        }

    }
}
