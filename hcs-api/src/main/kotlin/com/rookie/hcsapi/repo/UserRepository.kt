package com.rookie.hcsapi.repo

import com.rookie.hcsapi.model.UserModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository


@Repository
interface UserRepository: JpaRepository<UserModel, Long> {
    @Query(value = "SELECT * FROM user_model where phone_number = ?1", nativeQuery = true)
    fun findByPhoneNumber(phoneNumber: String?): UserModel?
}