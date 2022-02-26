package com.b2b.employee.monitoring.core.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
public class OvertimeRequest {

    private long id;
    private LocalDateTime startDateTime;
    private Employee employee;
    private long managerId;
    private double hours;
    private String reason;
    private String status;
    private String createdBy;
    private LocalDateTime createdDateTime;
    private String updatedBy;
    private LocalDateTime updatedDateTime;

}
