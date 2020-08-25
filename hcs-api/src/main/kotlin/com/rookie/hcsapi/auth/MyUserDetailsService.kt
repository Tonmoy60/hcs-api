package com.rookie.hcsapi.auth


import com.rookie.hcsapi.repo.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service
import java.util.*

@Service
class MyUserDetailsService : UserDetailsService {

    @Autowired
    private var userRepository:UserRepository?=null

    @Throws(UsernameNotFoundException::class)
    override fun loadUserByUsername(s: String): UserDetails? {
//        var userModel= userRepository?.findByPhoneNumber(s)
//        print(s+"    ")
//        print(userModel)

        val user = AuthRequestBody("01686352645", "4455")
        return if (user != null) {
            User(user.username, user.password,
                    ArrayList())
        } else null
    }
}