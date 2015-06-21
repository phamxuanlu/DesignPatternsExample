package com.lupham.design.patterns.singleton;

/**
 * Created by LuPham on 6/21/2015.
 */
public class SingletonWithThread {

    private SingletonWithThread() {

    }

    private static volatile SingletonWithThread _instance;

    public static  SingletonWithThread getInstance() {
        if(null==_instance){
            synchronized (SingletonWithThread.class){
                if(null==_instance){
                    _instance = new SingletonWithThread();
                }
            }
        }

        return _instance;
    }

}
