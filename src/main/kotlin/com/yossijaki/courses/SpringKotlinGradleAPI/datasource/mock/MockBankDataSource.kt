package com.yossijaki.courses.SpringKotlinGradleAPI.datasource.mock

import com.yossijaki.courses.SpringKotlinGradleAPI.datasource.BankDataSource
import com.yossijaki.courses.SpringKotlinGradleAPI.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    val banks = listOf(
        Bank("1234", 3.14, 17),
        Bank("1010", 17.0, 0),
        Bank("5674", 0.0, 100),
    )

    override fun retrieveBanks(): Collection<Bank> = banks

}