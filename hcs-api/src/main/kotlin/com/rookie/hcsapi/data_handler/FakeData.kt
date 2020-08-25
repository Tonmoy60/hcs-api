package com.rookie.hcsapi.data_handler
import com.rookie.hcsapi.core.Response
import com.rookie.hcsapi.model.*

import org.springframework.stereotype.Repository
import java.util.*

@Repository("fakeData")
class FakeData : DataHandlerInterface {
    override fun sendOtp(phoneNumber: String): Response? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAllUser(): List<UserModel>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getUserById(id: Long): Optional<UserModel>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createUser(userModel: UserModel): UserModel? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeUser(id: Long): Unit? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findAllService(): List<ServiceModel>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findServiceById(id: Long): Optional<ServiceModel>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createService(serviceModel: ServiceModel): ServiceModel? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeService(id: Long): Unit? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findAllPromo(): List<PromoModel>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findPromoById(id: Long): Optional<PromoModel>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createPromo(promoModel: PromoModel): PromoModel? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removePromoById(id: Long): Unit? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findAllTask(): List<TaskModel>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findTaskById(id: Long): Optional<TaskModel>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createTask(taskModel: TaskModel): TaskModel? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeTaskById(id: Long): Unit? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findAllTaskByUserId(userId: Long): List<TaskModel>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findTopTenFrequentlyTaken(id: Long, noOfItem: Int): List<TaskModel>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findHistoryById(userId: Long): List<TaskModel>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}