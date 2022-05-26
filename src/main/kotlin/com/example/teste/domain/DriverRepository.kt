package com.example.teste.domain

import org.springframework.data.jpa.repository.JpaRepository

interface DriverRepository:JpaRepository<Driver, Long> {
}