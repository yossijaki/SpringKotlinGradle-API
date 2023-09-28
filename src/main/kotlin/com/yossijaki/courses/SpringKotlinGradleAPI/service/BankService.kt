package com.yossijaki.courses.SpringKotlinGradleAPI.service

import com.yossijaki.courses.SpringKotlinGradleAPI.datasource.BankDataSource
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {



}