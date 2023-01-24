package com.finance.wallet.resources.repository.sql

import com.finance.wallet.entities.User
import com.finance.wallet.repository.UserRepository
import com.finance.wallet.resources.repository.sql.spring.UserRepositorySpring

class UserRepositoryImpl(
    private val userRepositorySpring: UserRepositorySpring
): UserRepository {
    override suspend fun getUsersByEmail(): User {
        return userRepositorySpring.findByEmail().toDomain()
    }

}