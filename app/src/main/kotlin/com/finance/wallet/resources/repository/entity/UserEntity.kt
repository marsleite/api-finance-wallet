package com.finance.wallet.resources.repository.entity

import com.finance.wallet.entities.User
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("user")
data class UserEntity(
    @Id
    val id: Long?,
    val name: String,
    val email: String
) {
    fun toDomain(): User {
        return User(
            id = id,
            name = name,
            email = email
        )
    }
}