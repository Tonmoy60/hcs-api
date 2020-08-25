//package com.rookie.hcsapi
//
//import com.rookie.hcsapi.model.UserModel
//import com.rookie.hcsapi.repo.UserRepository
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.boot.CommandLineRunner
//import org.springframework.boot.autoconfigure.SpringBootApplication
//import org.springframework.data.jpa.repository.config.EnableJpaAuditing
//
//@SpringBootApplication
//@EnableJpaAuditing // Enabling JPA Auditing
//class CommandLine : CommandLineRunner {
//
//    @Autowired
//    var userRepository: UserRepository? = null
//
//    val userModel:UserModel=UserModel(1,"shimanto","01686352645","shimanto7710@gmail.com","Shi77","Airtel","shi77")
//    override fun run(vararg args: String?) {
//        userRepository?.save(userModel)
//    }
//}