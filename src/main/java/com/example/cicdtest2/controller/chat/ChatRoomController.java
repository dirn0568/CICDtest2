package com.example.cicdtest2.controller.chat;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // @ResponseBody 필요할때 쓰기!
@RequiredArgsConstructor
public class ChatRoomController {
    @ResponseBody
    @GetMapping("/chatstest")
    public void chatroomCreate2() {
        System.out.println("1111111111111111111111111");
    }

    @ResponseBody
    @GetMapping("/chatstest2")
    public void chatroomCreate3() {
        System.out.println("222222222222222222222222222222222");
    }

    @ResponseBody
    @PostMapping("/chatstest3")
    public void chatroomCreate() {
        System.out.println("3333333333333333333333333333333");
    }
}
