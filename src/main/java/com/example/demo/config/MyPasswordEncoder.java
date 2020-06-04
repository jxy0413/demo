package com.example.demo.config;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Auther jxy
 * @Date 2020-06-01
 */
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}