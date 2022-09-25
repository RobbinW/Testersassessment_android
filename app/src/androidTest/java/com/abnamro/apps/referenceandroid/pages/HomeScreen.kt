package com.abnamro.apps.referenceandroid.pages

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.abnamro.apps.referenceandroid.R

class HomeScreen : BaseScreen() {

    //variables, used for functions
    var helloWorldText = onView(withText("Hello World!"))

    //function click Mail Button
    fun showHelloWorldText() {

        helloWorldText.check(matches(isDisplayed()))

    }
}