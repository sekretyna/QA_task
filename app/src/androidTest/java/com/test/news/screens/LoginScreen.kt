package com.test.news.screens

import android.view.Gravity.apply
import androidx.core.view.GravityCompat.apply
import com.agoda.kakao.common.views.KView
import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.test.news.R


class LoginScreen : Screen<LoginScreen>() {
    val usernameInput = KEditText { withId(R.id.editTextUserName)}
    val passwordInput = KEditText { withId(R.id.editTextPassword)}
    val loginButton = KButton {withId(R.id.buttonLogin)}
}

fun loginScreen(func: LoginScreen.() -> Unit) = LoginScreen.apply(func)

