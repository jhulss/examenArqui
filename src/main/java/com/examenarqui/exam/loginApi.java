package com.examenarqui.exam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.examenarqui.exam.dto.errorResponse;
import com.examenarqui.exam.dto.loginDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

public interface  loginApi {
    @Tag(name = "Login", description = "User login operations")
    @PostMapping("/login")
    @Operation(summary = "User login", description = "Handle user login with email and password")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successful login", 
                     content = @Content(mediaType = "application/json", 
                                        schema = @Schema(implementation = loginDto.class))),
        @ApiResponse(responseCode = "400", description = "Invalid email or password", 
                     content = @Content(mediaType = "application/json", 
                                        schema = @Schema(implementation = errorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", 
                     content = @Content(mediaType = "application/json", 
                                        schema = @Schema(implementation = errorResponse.class)))
    })
    public ResponseEntity<loginDto> login(@RequestBody loginDto loginRequest);
}
