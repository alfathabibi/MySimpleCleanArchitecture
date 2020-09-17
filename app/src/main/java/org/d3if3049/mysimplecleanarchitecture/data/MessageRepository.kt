package org.d3if3049.mysimplecleanarchitecture.data

import org.d3if3049.mysimplecleanarchitecture.domain.IMessageRepository
import org.d3if3049.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
      return messageDataSource.getMessageFromSource(name)
    }
}