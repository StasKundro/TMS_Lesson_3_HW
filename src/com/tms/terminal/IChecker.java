package com.tms.terminal;

import com.tms.document.MainInfo;

public interface IChecker {
    void registerDocument(MainInfo newInfo);

    boolean registerNewDocumentByDate(String date);
}
