package com.yossijaki.courses.SpringKotlinGradleAPI.service

import com.yossijaki.courses.SpringKotlinGradleAPI.datasource.BankDataSource
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BankServiceTest {

    //private val dataSource = BankDataSource
    private val bankService = BankService()

    @Test
    fun `should call its data source to retreive banks`() {
        // given

    
        //when
        val banks = bankService.getBanks()

        
        //then

    }
}