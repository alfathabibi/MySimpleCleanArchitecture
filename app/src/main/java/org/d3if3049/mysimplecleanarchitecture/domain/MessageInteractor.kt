package org.d3if3049.mysimplecleanarchitecture.domain

import java.lang.StringBuilder


class MessageInteractor(private val messageRepository: IMessageRepository) : MessageUseCase {
    override fun getMessage(name: String): MessageEntity {
        return messageRepository.getWelcomeMessage(name)
    }
}