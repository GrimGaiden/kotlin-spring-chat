package com.example.kotlin.chat.service

interface MessageService {

    suspend fun latest(): List<MessageVM>

    suspend fun after(lastMessageId: String): List<MessageVM>

    suspend fun post(message: MessageVM)
}