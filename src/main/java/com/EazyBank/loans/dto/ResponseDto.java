package com.EazyBank.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(name = "Response", description = "schema to hold successful response information")
@Data
@AllArgsConstructor
public class ResponseDto {

    @Schema(description = "Status code of the response")
    private String statusCode;

    @Schema(description = "Status message of the response")
    private String statusMessage;
}
