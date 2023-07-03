package com.uniminuto.citas.model;

import lombok.Data;

@Data
public class InsertCita {
    private String code;
    private String typeProcess;

    private String documentId;

    private String typeQuote;

    private String typeDocument;

    private String nameClient;

    private String doctorName;

    private String dateQuote;

    private int ageClient;

}
