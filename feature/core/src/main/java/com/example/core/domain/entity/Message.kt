package com.example.core.domain.entity

sealed class BaseMessage{
    private var _msgType: MessageType = MessageType.Send
    fun setMsgType(type: MessageType){
        _msgType = type
    }

    val msgType get() = _msgType
}
data class Message(
    val message: String
): BaseMessage()

data class ImageMessage(
    val image: List<String>
): BaseMessage()

enum class MessageType {
    Receive, Send, ReceiveImg, SendImg, ReceiveMultiImg, SendMultiImg
}
