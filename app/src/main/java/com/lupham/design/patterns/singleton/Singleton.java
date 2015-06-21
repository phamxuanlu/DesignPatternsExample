package com.lupham.design.patterns.singleton;

/**
 * Created by LuPham on 6/21/2015.
 */

//http://java.dzone.com/articles/singleton-design-pattern-%E2%80%93

public class Singleton {

    //Private constructor : This will prevent anybody else to instantiate the Singleton class.
    private Singleton() {

    }


    // Static member holds only one instance of the
    // SingletonExample class
    //Static member : This contains the instance of the singleton class.
    private static Singleton _instance;


    //Static public method : This provides the global point of access to the Singleton object and returns the instance to the client calling class.
    // Providing Global point of access
    public static Singleton getInstance() {
        if (_instance == null)
            _instance = new Singleton();

        return _instance;
    }

}
