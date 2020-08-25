package com.rookie.hcsapi.model

import javax.persistence.*

@Entity
@Table(name = "banner")
class Banner(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        var id: Long = 0,
        @Column(name = "userName")
        var userName: String? = null,
        @Column(name = "phoneNumber")
        var phoneNumber: String? = null,
        @Column(name = "email")
        var email: String? = null,
        @Column(name = "shareCode")
        var shareCode: String? = null,
        @Column(name = "operator")
        var operator: String? = null,
        @Column(name = "imageUrl")
        var imgUrl: String? = null
) {

    override fun toString(): String {
        return "Banner(id=$id, userName=$userName, phoneNumber=$phoneNumber, email=$email, shareCode=$shareCode, operator=$operator, imgUrl=$imgUrl)"
    }
}