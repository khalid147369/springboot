package com.khalid.myApp.DTO;

import java.time.LocalDate;

public class SubscriptionDTO {

    private Long familyId;
    private Long offerId;
    private LocalDate startDate;
    private LocalDate endDate;

    public SubscriptionDTO() {
    }

    public SubscriptionDTO(Long familyId, Long offerId, LocalDate startDate, LocalDate endDate) {
        this.familyId = familyId;
        this.offerId = offerId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Long familyId) {
        this.familyId = familyId;
    }

    public Long getOfferId() {
        return offerId;
    }

    public void setOfferId(Long offerId) {
        this.offerId = offerId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}