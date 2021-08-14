package com.test.news.screens

import androidx.core.view.GravityCompat.apply
import androidx.test.espresso.action.ViewActions.replaceText
import com.agoda.kakao.screen.Screen

class LoginRobot : Screen<LoginRobot>(){
    fun checkIfDisplayed() = loginScreen {
        usernameInput { isDisplayed() }
        passwordInput { isDisplayed() }
        loginButton { isDisplayed() }
    }

    fun typeUsername(username: String) {
        loginScreen { usernameInput { replaceText(username) } }
    }

    fun typePassword(password: String) {
        loginScreen { passwordInput { replaceText(password) } }
    }

    fun pressLogin() {
        loginScreen { loginButton { click() } }
    }

    fun loginForm(func: LoginRobot.() -> Unit) = LoginRobot.apply(func)
}