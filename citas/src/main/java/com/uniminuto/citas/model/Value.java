package com.uniminuto.citas.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "CLIENT_NAME",
        "TYPE_DOCUMENT",
        "TYPE_QUOTE",
        "DOCTOR_NAME",
        "DATE_QUOTE",
        "AGE_CLIENT"
})
@Data
public class Value {

    @JsonProperty("ID")
    public int id;
    @JsonProperty("CLIENT_NAME")
    public String clientName;
    @JsonProperty("TYPE_DOCUMENT")
    public String typeDocument;
    @JsonProperty("TYPE_QUOTE")
    public String typeQuote;
    @JsonProperty("DOCTOR_NAME")
    public String doctorName;
    @JsonProperty("DATE_QUOTE")
    public String dateQuote;
    @JsonProperty("AGE_CLIENT")
    public int ageClient;
}
