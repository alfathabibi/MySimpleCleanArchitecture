package org.d3if3049.mysimplecleanarchitecture.di

import org.d3if3049.mysimplecleanarchitecture.data.IMessageDataSource
import org.d3if3049.mysimplecleanarchitecture.data.MessageDataSource
import org.d3if3049.mysimplecleanarchitecture.data.MessageRepository
import org.d3if3049.mysimplecleanarchitecture.domain.IMessageRepository
import org.d3if3049.mysimplecleanarchitecture.domain.MessageInteractor
import org.d3if3049.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase{
        val messageRepository = provideRepository()
        return  MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}