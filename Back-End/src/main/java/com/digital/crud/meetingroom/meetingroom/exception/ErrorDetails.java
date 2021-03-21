package com.digital.crud.meetingroom.meetingroom.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;
}