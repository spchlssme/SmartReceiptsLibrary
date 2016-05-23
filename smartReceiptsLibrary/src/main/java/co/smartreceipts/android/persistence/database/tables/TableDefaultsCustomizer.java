package co.smartreceipts.android.persistence.database.tables;

public interface TableDefaultsCustomizer {

    void insertCSVDefaults(CSVTable table);

    void insertPDFDefaults(PDFTable table);
}