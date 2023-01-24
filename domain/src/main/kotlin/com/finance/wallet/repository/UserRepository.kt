package com.finance.wallet.repository

import com.finance.wallet.entities.User

interface UserRepository {

    suspend fun getUsersByEmail(): User
}