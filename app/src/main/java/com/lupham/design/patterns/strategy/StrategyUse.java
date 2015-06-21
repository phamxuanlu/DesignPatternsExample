package com.lupham.design.patterns.strategy;

import android.graphics.Bitmap;

/**
 * Created by LuPham on 6/21/2015.
 */
public class StrategyUse {

    public void test() {
        EditorContext editorContext = new EditorContext();
        Bitmap bm = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);

        //Use Grayscale Strategy
        editorContext.setTransformation(new Grayscale());
        Bitmap result = editorContext.doTransform(bm);

        //Use Sepia Strategy
        editorContext.setTransformation(new SepiaEffect());
        result = editorContext.doTransform(bm);

        //Use Neon Strategy
        editorContext.setTransformation(new NeonEffect());
        bm = result = editorContext.doTransform(bm);
    }

}
