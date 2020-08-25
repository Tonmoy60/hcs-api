package com.rookie.hcsapi.controller

import com.rookie.hcsapi.auth.AuthRequestBody
import com.rookie.hcsapi.core.LoginSuccessBody
import com.rookie.hcsapi.core.Response
import com.rookie.hcsapi.data_handler.DataHandlerInterface
import com.rookie.hcsapi.model.*
import com.rookie.hcsapi.repo.UserRepository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

import java.util.*

@Service
class ControllerService : DataHandlerInterface {

    private var dataHandler: DataHandlerInterface? = null

    @Autowired
    fun authServices(@Qualifier("realData") dataHandler: DataHandlerInterface?) {
        this.dataHandler = dataHandler
    }

    @Autowired
    private var userRepository: UserRepository? = null


    override fun sendOtp(phoneNumber: String): Response? {
        return Response(true, "5544")
    }

    override fun getAllUser(): List<UserModel>? {
        return dataHandler?.getAllUser()
    }

    override fun getUserById(id: Long): Optional<UserModel>? {
        return dataHandler?.getUserById(id)
    }

    override fun createUser(userModel: UserModel): UserModel? {
        return dataHandler?.createUser(userModel)
    }

    override fun removeUser(id: Long): Unit? {
        return dataHandler?.removeUser(id)
    }

    override fun findAllService(): List<ServiceModel>? {
        return dataHandler?.findAllService()
    }

    override fun findServiceById(id: Long): Optional<ServiceModel>? {
        return dataHandler?.findServiceById(id)
    }

    override fun createService(serviceModel: ServiceModel): ServiceModel? {
        return dataHandler?.createService(serviceModel)
    }

    override fun removeService(id: Long): Unit? {
        return dataHandler?.removeService(id)
    }

    override fun findAllPromo(): List<PromoModel>? {
        return dataHandler?.findAllPromo()
    }

    override fun findPromoById(id: Long): Optional<PromoModel>? {
        return dataHandler?.findPromoById(id)
    }

    override fun createPromo(promoModel: PromoModel): PromoModel? {
        return dataHandler?.createPromo(promoModel)
    }

    override fun removePromoById(id: Long): Unit? {
        return dataHandler?.removePromoById(id)
    }

    override fun findAllTask(): List<TaskModel>? {
        return dataHandler?.findAllTask()
    }

    override fun findTaskById(id: Long): Optional<TaskModel>? {
        return dataHandler?.findTaskById(id)
    }

    override fun createTask(taskModel: TaskModel): TaskModel? {
        return dataHandler?.createTask(taskModel)
    }

    override fun removeTaskById(id: Long): Unit? {
        return dataHandler?.removeTaskById(id)
    }

    override fun findAllTaskByUserId(userId: Long): List<TaskModel>? {
        return dataHandler?.findAllTaskByUserId(userId)
    }

    override fun findTopTenFrequentlyTaken(id: Long, noOfItem: Int): List<TaskModel>? {
        return dataHandler?.findTopTenFrequentlyTaken(id,noOfItem)
    }

    override fun findHistoryById(userId: Long): List<TaskModel>? {
        return dataHandler?.findHistoryById(userId)
    }

    fun login(authRequestBody: AuthRequestBody): LoginSuccessBody? {
        var userModel = userRepository?.findByPhoneNumber(authRequestBody.username)
        if (userModel==null){
            userModel=userRepository?.save(UserModel(-10,null,authRequestBody.username,null,null,"xyz10",null))
        }
        return LoginSuccessBody(userModel)
    }


}