package com.example.cicdtest2.controller.chat;

import com.example.cicdtest2.dto.chat.ChatMessageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@RequiredArgsConstructor
@Controller
public class ChatController {
    private final SimpMessageSendingOperations messagingTemplate;
    @ResponseBody
    @MessageMapping("/chats") // socket 통신은 request를 안주나??? // 혹시 @Transactional 줘야하나???
    public void message(ChatMessageDto chatMessageDto) {
        System.out.println("33333333333333333333333333333333333333333333333");
        System.out.println(chatMessageDto.getMessage());
        System.out.println(chatMessageDto.getChatRoomId());
        System.out.println(chatMessageDto.getUserEmail());
        System.out.println("333333333333333333333333333333333333333333333333");

        messagingTemplate.convertAndSend("/sub/chats/" + chatMessageDto.getChatRoomId(), chatMessageDto);
    }


}
