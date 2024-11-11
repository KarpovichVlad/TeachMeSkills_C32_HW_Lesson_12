package com.teachmeskills.c32.hw.lesson_12.task2.service;

import com.teachmeskills.c32.hw.lesson_12.task2.constans.Constants;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class URLChecker {

    public String checkUrlValidity(String url) {
        Pattern pattern = Pattern.compile(Constants.URL_PATTERN);
        Matcher matcher = pattern.matcher(url);
        return matcher.find() ? "The link is valid" : "The link is not valid";
    }
}
