package com.tms.document;

import java.util.Date;

public class DocumentContract extends Document {
    public int documentNum;
    public String contractEndDate;
    public String employeeName;

    public DocumentContract() {
    }

    public DocumentContract(int documentNum, String contractEndDate, String employeeName, Date documentDate) {
        super(documentDate);
        this.documentNum = documentNum;
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "Дата документа: " + documentDate + "; " +
                "Имя сотрудника: " + employeeName + "; " +
                "Номер документа: " + documentNum + "; " +
                "Окончание документа: " + contractEndDate + "; ";


    }
}
