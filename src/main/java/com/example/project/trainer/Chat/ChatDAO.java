package com.example.project.trainer.Chat;

import com.example.project.trainer.Chat.entity.ChatMessage;
import com.example.project.trainer.Chat.entity.ChatRoom;

public interface ChatDAO {
    void createChatRoom(ChatRoom room);
    public ChatRoom findChatRoom(String user_id,Long trainer_id);
    ChatMessage saveMessage(ChatMessage message);

}