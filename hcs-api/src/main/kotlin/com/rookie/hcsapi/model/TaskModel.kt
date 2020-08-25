package com.rookie.hcsapi.model


import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "task_table")
class TaskModel(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        var id: Long?=null,
        @Column(name = "start_location")
        var startLocation: String?=null,
        @Column(name = "end_location")
        var endLocation: String?=null,
        @Column(name = "unit")
        var unit: Int?=null,
        @Column(name = "price")
        var price: Int?=null,
        @Column(name = "status")
        var status: Int?=null,
        @Column(name = "discount")
        var discount: Int?=null,
        @Column(name = "location")
        var location: String?=null,
        @Column(name = "store_time")
        var storeTime: String??=null,
        @OneToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "promo_id")
        var promoModel: PromoModel?=null,
        @OneToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "service_id")
        var serviceModel: ServiceModel?=null,
        @OneToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "user_id")
        var userModel: UserModel?=null
) : Serializable {

    override fun toString(): String {
        return "TaskModel(id=$id, startLocation='$startLocation', endLocation='$endLocation', unit=$unit, price=$price, status=$status, discount=$discount, location='$location', storeTime=$storeTime, promoModel=$promoModel, serviceModel=$serviceModel, userModel=$userModel)"
    }
}