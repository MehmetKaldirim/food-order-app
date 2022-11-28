package com.zeroToHero.application.handler;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Builder
@Slf4j
@AllArgsConstructor
public class ErrorDTO {
    private final String code;
    private final String message;

}
