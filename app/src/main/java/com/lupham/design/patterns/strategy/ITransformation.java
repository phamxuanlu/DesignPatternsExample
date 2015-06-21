package com.lupham.design.patterns.strategy;

import android.graphics.Bitmap;

/**
 * Created by LuPham on 6/21/2015.
 */
public interface ITransformation {

    public Bitmap transform(Bitmap bitmap);

}
