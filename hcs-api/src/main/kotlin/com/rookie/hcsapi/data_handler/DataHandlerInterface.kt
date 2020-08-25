package com.rookie.hcsapi.data_handler


import com.rookie.hcsapi.core.Response
import com.rookie.hcsapi.model.*
import java.util.*


interface DataHandlerInterface {

     public fun sendOtp(phoneNumber: String): Response?

     public fun getAllUser():List<UserModel>?

     public fun getUserById(id:Long) :  Optional<UserModel>?

     public fun createUser(userModel: UserModel) : UserModel?

     public fun removeUser(id:Long) : Unit?


     fun findAllService():List<ServiceModel>?

     fun findServiceById(id:Long): Optional<ServiceModel>?

     fun createService(serviceModel: ServiceModel) : ServiceModel?

     fun removeService(id:Long):Unit?

     fun findAllPromo() :List<PromoModel>?

     fun findPromoById(id:Long): Optional<PromoModel>?

     fun createPromo(promoModel: PromoModel) : PromoModel?

     fun removePromoById(id: Long) :Unit?

     fun findAllTask():List<TaskModel>?

     fun findTaskById(id: Long):Optional<TaskModel>?

     fun createTask(taskModel: TaskModel) : TaskModel?

     fun removeTaskById(id: Long):Unit?

     fun findAllTaskByUserId(userId: Long): List<TaskModel>?

     fun findTopTenFrequentlyTaken(id: Long, noOfItem: Int): List<TaskModel>?

     fun findHistoryById(userId:Long):List<TaskModel>?

}
