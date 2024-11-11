package com.teachmeskills.c32.hw.lesson_12.task1.service;

import com.teachmeskills.c32.hw.lesson_12.task1.constants.Constants;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class HexCodeChecker {

    public String getHexColorResult(String text) {
        Pattern pattern = Pattern.compile(Constants.HEX_COLOR_PATTERN);
        Matcher matcher = pattern.matcher(text);
        return matcher.find() ? "Yes" : "No";
    }
}
