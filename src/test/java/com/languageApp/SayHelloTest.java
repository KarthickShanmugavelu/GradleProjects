package com.languageapp;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import com.languageApp.SayHello;

public class SayHelloTest {
    @Test
    public void testSayHello() throws IOException {
        SayHello.main(new String[]{"en"});
    }
}