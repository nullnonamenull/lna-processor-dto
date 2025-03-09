package com.noname.lnaprocessordto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageRequestDTO {

    private String message;

}