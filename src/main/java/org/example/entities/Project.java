package org.example.entities;

import java.time.LocalDate;

public class Project {
    private Long clientId;
    private LocalDate startDate;
    private LocalDate finishDate;

    public Long getClientId() {
        return clientId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public Project(Long clientId, LocalDate startDate, LocalDate finishDate) {
        this.clientId = clientId;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }
}
