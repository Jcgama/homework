package com.homework.HomeWork.Entities

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*
import javax.validation.constraints.Email

@Entity
@Table(name="users")
data class User(@Id
                @GeneratedValue(strategy = GenerationType.AUTO)
                @JsonIgnore
                val id: Long = 0){

    var name: String = ""

    @Email
    var email: String = ""

}