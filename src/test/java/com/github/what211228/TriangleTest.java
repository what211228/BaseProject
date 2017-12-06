package com.github.what211228;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void getType() throws Exception {
        Triangle tri = new Triangle(5,10,5);

        String result = tri.getType();

        Assert.assertEquals("不是三角形",result);
    }


}
