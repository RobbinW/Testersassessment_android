package com.abnamro.apps.referenceandroid.tests

import com.abnamro.apps.referenceandroid.pages.HomeScreen
import org.junit.Test

class HomeTest : BaseTest(){

    var HomeScreen = HomeScreen()

    @Test
    fun testShowHelloWorldText() {
        HomeScreen.showHelloWorldText()
    }
}
