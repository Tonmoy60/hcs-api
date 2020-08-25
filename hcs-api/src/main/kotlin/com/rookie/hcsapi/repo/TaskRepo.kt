package com.rookie.hcsapi.repo

import com.rookie.hcsapi.model.ServiceModel
import com.rookie.hcsapi.model.TaskModel
import com.rookie.hcsapi.model.UserModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface TaskRepo : JpaRepository<TaskModel, Long> {
    @Query(value = "SELECT * FROM task_table where user_id = ?1", nativeQuery = true)
    fun findAllTaskByUSerId(userId: Long?): List<TaskModel>?

    @Query("SELECT * from task_table where user_id=?1 AND status=4 GROUP BY service_id ORDER BY COUNT(service_id) DESC LIMIT ?2", nativeQuery = true)
    fun findTopTenFrequentlyTaken(id: Long, noOfItem: Int): List<TaskModel>?

    @Query("SELECT * FROM `task_table` WHERE user_id=?1 AND status=4", nativeQuery = true)
    fun findHistoryByUserId(id: Long): List<TaskModel>?

//    @Query(value = "SELECT * FROM TaskModel where phone_number = ?1", nativeQuery = true)
//    fun findAllTaskByUSerId(phoneNumber: String?): UserModel?
}