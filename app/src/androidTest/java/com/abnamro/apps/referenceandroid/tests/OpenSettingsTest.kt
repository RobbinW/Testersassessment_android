package com.abnamro.apps.referenceandroid.tests

import com.abnamro.apps.referenceandroid.pages.SettingsScreen
import org.junit.Test

class OpenSettingsTest : BaseTest() {

    var settingsScreen = SettingsScreen()

    @Test
    fun testClickSettingsButton() {
        settingsScreen.clickSettingsButton()
    }

}


