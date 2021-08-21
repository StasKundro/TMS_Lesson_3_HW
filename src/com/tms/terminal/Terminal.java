package com.tms.terminal;

import com.tms.document.MainInfo;
import com.tms.terminal.IChecker;

public class Terminal implements IChecker {
    @Override
    public void registerDocument(MainInfo newInfo) {
        System.out.println("Регистрация документа");
    }

    @Override
    public boolean registerNewDocumentByDate(String date) {
        System.out.println("Регистрация документа по дате");
        return true;
    }

}
