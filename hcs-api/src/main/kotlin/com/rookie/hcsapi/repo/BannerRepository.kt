package com.rookie.hcsapi.repo


import com.rookie.hcsapi.model.Banner
import org.springframework.data.jpa.repository.JpaRepository

interface BannerRepository : JpaRepository<Banner, Long> {
}