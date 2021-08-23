package com.tms.terminal;

import com.tms.document.Document;

import java.util.Scanner;

public class Register implements IChecker {
    public Document[] documentsArray = new Document[10];
    int count = 0;

    @Override
    public void saveDocument(Document document) {
        if (count < documentsArray.length) {
            documentsArray[count] = document;
            count++;
        } else {
            System.out.println("Достигнут лимит");
        }
    }
    @Override
    public String getInfo(Document document) {
        return document.toString();
    }
}
