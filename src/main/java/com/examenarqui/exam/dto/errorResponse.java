package com.examenarqui.exam.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class errorResponse {
    
    @NotNull
    final String message;
    public errorResponse(String message) {
        this.message = message;
    }
}
