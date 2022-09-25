package com.abnamro.apps.referenceandroid.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.platform.app.InstrumentationRegistry.getInstrumentation
import com.abnamro.apps.referenceandroid.R

class SettingsScreen {

    var settingsMenuTitle = "Settings"

    fun clickSettingsButton() {

        //This opens the settings menu bar
        openActionBarOverflowOrOptionsMenu(getInstrumentation().targetContext)
        //Clicks menu
        onView(withText(settingsMenuTitle)).perform(click())

    }

}