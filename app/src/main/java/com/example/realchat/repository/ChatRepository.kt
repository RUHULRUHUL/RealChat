package com.example.realchat.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.realchat.helper.room.MessageDB
import com.example.realchat.model.message.Messages
import com.example.realchat.model.profile.KeyBordType

class ChatRepository {
    private val resource = ResourceOperation()
    var onlineStatusLiveData = MutableLiveData<String>()

    fun updateTypingStatus(type: KeyBordType) {
        resource.updateTypingStatus(type)
    }

    fun sendMessage(messageDB:MessageDB,messages: Messages, receiverId: String) {
        resource.sendTxtMessage(messageDB,messages, receiverId)
    }

    fun getOnlineStatus(receiverId: String):MutableLiveData<String>{
        onlineStatusLiveData.postValue(resource.getOnlineStatus(receiverId))
        return onlineStatusLiveData
    }

    fun getMessagesByChatUserId(messageDB:MessageDB) = messageDB.messageDao()?.getAllMessages()


}