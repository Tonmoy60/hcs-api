package com.rookie.hcsapi.repo

import com.rookie.hcsapi.model.Banner
import com.rookie.hcsapi.model.ServiceModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ServiceRepo : JpaRepository<ServiceModel, Long> {
}