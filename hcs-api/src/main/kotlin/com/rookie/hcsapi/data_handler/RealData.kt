package com.rookie.hcsapi.data_handler
import com.rookie.hcsapi.core.Response
import com.rookie.hcsapi.model.*
import com.rookie.hcsapi.repo.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import java.util.*

@Repository("realData")
class RealData : DataHandlerInterface {

    @Autowired
    var userRepository: UserRepository? = null


    @Autowired
    var serviceRepo: ServiceRepo? = null

    @Autowired
    var promoRepo: PromoRepo? = null

    @Autowired
    var taskRepo: TaskRepo? = null


    override fun sendOtp(phoneNumber: String): Response? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAllUser(): List<UserModel>? {
        return userRepository?.findAll()
    }

    override fun getUserById(id:Long): Optional<UserModel>? {
        return userRepository?.findById(id)
    }

    override fun createUser(userModel: UserModel): UserModel? {
        return userRepository?.save(userModel)

    }

    override fun removeUser(id: Long): Unit? {
        return userRepository?.deleteById(id)
    }


    override fun findAllService(): List<ServiceModel>? {
        return serviceRepo?.findAll()
    }

    override fun findServiceById(id: Long): Optional<ServiceModel>? {
        return serviceRepo?.findById(id)
    }

    override fun createService(serviceModel: ServiceModel): ServiceModel? {
        return serviceRepo?.save(serviceModel)
    }

    override fun removeService(id: Long): Unit? {
        return serviceRepo?.deleteById(id)
    }

    override fun findAllPromo(): List<PromoModel>? {
        return promoRepo?.findAll()
    }

    override fun findPromoById(id: Long): Optional<PromoModel>? {
        return promoRepo?.findById(id)
    }

    override fun createPromo(promoModel: PromoModel): PromoModel? {
//        var serviceModel:ServiceModel=ServiceModel(1,null,null,null,null,null,null)
        return promoRepo?.save(promoModel)
    }

    override fun removePromoById(id: Long): Unit? {
        return promoRepo?.deleteById(id)
    }

    override fun findAllTask(): List<TaskModel>? {
        return taskRepo?.findAll()
    }

    override fun findTaskById(id: Long): Optional<TaskModel>? {
        return taskRepo?.findById(id)
    }

    override fun createTask(taskModel: TaskModel): TaskModel? {
        return taskRepo?.save(taskModel)
    }

    override fun removeTaskById(id: Long): Unit? {
        return taskRepo?.deleteById(id)
    }

    override fun findAllTaskByUserId(userId: Long): List<TaskModel>? {
        return taskRepo?.findAllTaskByUSerId(userId)
    }

    override fun findTopTenFrequentlyTaken(id: Long, noOfItem: Int): List<TaskModel>? {

        return taskRepo?.findTopTenFrequentlyTaken(id,noOfItem)
    }

    override fun findHistoryById(userId: Long): List<TaskModel>? {
        return taskRepo?.findHistoryByUserId(userId)
    }


}