package com.ljw.test;

import com.ljw.maven.HelloWorld;
import org.junit.Test;

public class helloTest {
    @Test
    public void Test(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.showMessage();
    }
}
