package com.finance.wallet.resources.repository.sql.spring

import com.finance.wallet.resources.repository.entity.UserEntity
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepositorySpring: CoroutineCrudRepository<UserEntity, Long> {
    suspend fun findByEmail(): UserEntity
}