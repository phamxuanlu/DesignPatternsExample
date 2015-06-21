package com.lupham.design.patterns.strategy;

import android.graphics.Bitmap;

/**
 * Created by LuPham on 6/21/2015.
 */
public class EditorContext {

    private ITransformation transformation;

    public void setTransformation(ITransformation transformation){
        this.transformation = transformation;
    }


    public Bitmap doTransform(Bitmap bm){
        if(transformation!=null){
            return  transformation.transform(bm);
        }
        else return null;
    }
}
