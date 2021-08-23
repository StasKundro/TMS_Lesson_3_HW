package com.tms.terminal;

import com.tms.document.Document;

public interface IChecker {

    void saveDocument(Document document);

    String getInfo(Document document);
}

