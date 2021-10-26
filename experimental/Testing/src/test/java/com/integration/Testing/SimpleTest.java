package com.integration.Testing;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SimpleTest {

    @Test
    public void simpleTest(){
        System.out.println("Success");
    }
}
