package com.examenarqui.exam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.examenarqui.exam.dto.tarjetaDto;
import com.examenarqui.exam.dto.errorResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

public interface CreditCardApi {

    @Tag(name = "Credit Card Transactions", description = "Credit card payment operations")
    @PostMapping("/payment")
    @Operation(summary = "Process payment", description = "Process a credit card payment")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Payment processed successfully", 
                     content = @Content(mediaType = "application/json", 
                                        schema = @Schema(implementation = tarjetaDto.class))),
        @ApiResponse(responseCode = "400", description = "Validation error: invalid card data", 
                     content = @Content(mediaType = "application/json", 
                                        schema = @Schema(implementation = errorResponse.class))),
        @ApiResponse(responseCode = "402", description = "Payment required: insufficient funds or credit limit exceeded", 
                     content = @Content(mediaType = "application/json", 
                                        schema = @Schema(implementation = errorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", 
                     content = @Content(mediaType = "application/json", 
                                        schema = @Schema(implementation = errorResponse.class)))
    })
    ResponseEntity<tarjetaDto> processPayment(@RequestBody tarjetaDto paymentRequest);
}
