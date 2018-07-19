package com.shreyans.mylauncher.pojos;

import android.graphics.drawable.Drawable;

public class PackagesPojo {
    private CharSequence label;
    private CharSequence packageName;
    private Drawable icon;

    public PackagesPojo(CharSequence label, CharSequence packageName, Drawable icon){

        this.label = label;
        this.packageName = packageName;
        this.icon = icon;
    }

    public CharSequence getLabel() {
        return label;
    }

    public CharSequence getPackageName() {
        return packageName;
    }

    public Drawable getIcon() {
        return icon;
    }
}
