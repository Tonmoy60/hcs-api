package com.rookie.hcsapi.model

import java.io.Serializable
import javax.persistence.*


@Entity
@Table(name = "service_table")
class ServiceModel(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        var id: Long? = null,
        @Column(name = "name")
        var serviceName: String? = null,
        @Column(name = "cost")
        var serviceCost: Double? = null,
        @Column(name = "distance")
        var distanceCost: Double? = null,
        @Column(name = "description")
        var serviceDes: String? = null,
        @Column(name = "type")
        var type: String? = null,
        @Column(name = "image")
        var image: String? = null

//        @OneToMany(mappedBy = "service_table", cascade = arrayOf(CascadeType.ALL), fetch = FetchType.EAGER)
//        var promoList: List<PromoModel> = emptyList()

) : Serializable {

    override fun toString(): String {
        return "ServiceModel(id=$id, serviceName='$serviceName', serviceCost=$serviceCost, distanceCost=$distanceCost, serviceDes='$serviceDes', type='$type', image='$image')"
    }
}