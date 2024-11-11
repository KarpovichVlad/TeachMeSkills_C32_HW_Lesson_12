package com.teachmeskills.c32.hw.lesson_12.task2;

import com.teachmeskills.c32.hw.lesson_12.task2.service.URLChecker;

public class ApplicationRunner {

    public static void main(String[] args) {
        String url1 = "https://teachmeskills.by/kursy/programmirovaniya-online";
        String url2 = "tcp://teachmeskills.by/kursy/programmirovaniya-online";

        URLChecker urlChecker = new URLChecker();

        System.out.println(urlChecker.checkUrlValidity(url1));
        System.out.println(urlChecker.checkUrlValidity(url2));
    }
}
