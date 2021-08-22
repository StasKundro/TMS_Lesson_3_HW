package com.tms.terminal;

import com.tms.document.MainInfo;


public class Register implements IChecker {
    @Override
    public void registerDocument(MainInfo newInfo) {
        System.out.println("Документ зарегистрирован");
    }

    @Override
    public boolean registerNewDocumentByDate(String date) {
        System.out.println("Регистрация документа по дате");
        return true;
    }

}
