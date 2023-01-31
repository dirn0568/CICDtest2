package com.example.cicdtest2.dto.chat;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
// @Setter 이거 없애니까 message, userJWT roomUUID가 회색빛으로 바뀜
@NoArgsConstructor
public class ChatMessageDto {
    private Long chatRoomId;
    private String userEmail;
    private String message; // 메시지
    // 테스트중
}
