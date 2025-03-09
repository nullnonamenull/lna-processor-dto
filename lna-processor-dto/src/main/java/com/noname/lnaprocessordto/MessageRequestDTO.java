package com.noname.lnaprocessordto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class MessageRequestDTO {

    private UUID sessionId;
    private String message;

}