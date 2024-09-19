package com.petclinic.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class Invoice {
    @JsonProperty("date")
    private LocalDate visitDate;
    @JsonProperty("purpose")
    private String visitPurpose;

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public String getVisitPurpose() {
        return visitPurpose;
    }
}