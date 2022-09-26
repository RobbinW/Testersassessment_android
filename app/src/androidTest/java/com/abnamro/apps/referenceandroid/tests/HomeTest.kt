package com.abnamro.apps.referenceandroid.tests

import com.abnamro.apps.referenceandroid.pages.HomeScreen
import org.junit.Test

class HomeTest : BaseTest(){

    var homeScreen = HomeScreen()

    @Test
    fun testShowHelloWorldText() {
        homeScreen.showHelloWorldText()
    }
}
