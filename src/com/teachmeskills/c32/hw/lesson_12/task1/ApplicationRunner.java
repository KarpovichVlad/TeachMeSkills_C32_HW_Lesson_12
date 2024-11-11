package com.teachmeskills.c32.hw.lesson_12.task1;

import com.teachmeskills.c32.hw.lesson_12.task1.service.HexCodeChecker;

public class ApplicationRunner {

    public static void main(String[] args) {
        String text = "#8b2323";
        HexCodeChecker hexCodeChecker = new HexCodeChecker();
        System.out.println(hexCodeChecker.getHexColorResult(text));
    }
}
