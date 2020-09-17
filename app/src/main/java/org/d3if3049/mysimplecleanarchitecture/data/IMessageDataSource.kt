package org.d3if3049.mysimplecleanarchitecture.data

import org.d3if3049.mysimplecleanarchitecture.domain.MessageEntity
import java.lang.StringBuilder

interface IMessageDataSource {
    fun getMessageFromSource(name: String) : MessageEntity
}