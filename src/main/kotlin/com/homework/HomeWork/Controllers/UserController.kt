package com.homework.HomeWork.Controllers

import com.homework.HomeWork.Entities.User
import com.homework.HomeWork.Repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/v1")
class UserController {

    @Autowired
    lateinit var user: User

    @Autowired
    lateinit var userRepository: UserRepository

    @GetMapping("/add")
    @ResponseBody
    fun createNewUser(@RequestParam("name") name: String,@RequestParam("email") email:String ):String{

        user.name = name
        user.email = email
        userRepository.save(user)

        return "Horray!"
    }

    @GetMapping("/all")
    @ResponseBody
    fun getAllUsers(): MutableList<User> {
        return userRepository.findAll()
    }
}