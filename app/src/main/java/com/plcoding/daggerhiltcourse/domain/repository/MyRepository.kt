package com.plcoding.daggerhiltcourse.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}