package com.rookie.hcsapi.model

import java.io.Serializable
import javax.persistence.*


@Entity
@Table(name = "promo")
class PromoModel(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        var id: Long? = null,
        @Column(name = "title")
        var title: String? = null,
        @Column(name = "description")
        var description: String? = null,
        @Column(name = "start_time")
        var startTimeStamp: String? = null,
        @Column(name = "end_time")
        var endTimeStamp: String? = null,
        @Column(name = "is_active")
        var isActive: Int? = null,
        @Column(name = "discount")
        var discount: Double? = null,
        @Column(name = "image")
        var imgUrl: String? = null,
        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "service_id")
        var service: ServiceModel? = null

) : Serializable {
    override fun toString(): String {
        return "PromoModel(id=$id, title=$title, description=$description, startTimeStamp=$startTimeStamp, endTimeStamp=$endTimeStamp, isActive=$isActive, discount=$discount, imgUrl=$imgUrl)"
    }
}