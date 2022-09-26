package com.abnamro.apps.referenceandroid.pages


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*


class HomeScreen : BaseScreen() {

    //variables, used for functions
    private var helloWorldText = onView(withText("Hello World!"))

    //function click Mail Button
    fun showHelloWorldText() {

        helloWorldText.check(matches(isDisplayed()))

    }
}