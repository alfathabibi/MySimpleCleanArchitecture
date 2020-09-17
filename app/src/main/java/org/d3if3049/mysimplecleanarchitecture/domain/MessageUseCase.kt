package org.d3if3049.mysimplecleanarchitecture.domain

import java.lang.StringBuilder

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}