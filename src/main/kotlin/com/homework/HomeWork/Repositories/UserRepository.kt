package com.homework.HomeWork.Repositories

import com.homework.HomeWork.Entities.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User,Long>{

}