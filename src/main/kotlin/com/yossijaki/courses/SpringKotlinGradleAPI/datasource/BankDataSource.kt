package com.yossijaki.courses.SpringKotlinGradleAPI.datasource

import com.yossijaki.courses.SpringKotlinGradleAPI.model.Bank

interface BankDataSource {

    fun retrieveBanks() : Collection<Bank>

}