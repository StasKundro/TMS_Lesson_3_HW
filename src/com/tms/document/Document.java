package com.tms.document;

import java.util.Date;

public abstract class Document {

    public Date documentDate;

    Document() {
    }

    Document(Date documentDate){
        this.documentDate = documentDate;
    }
}
