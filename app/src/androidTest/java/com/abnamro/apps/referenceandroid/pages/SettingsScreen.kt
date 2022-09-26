package com.abnamro.apps.referenceandroid.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.platform.app.InstrumentationRegistry.getInstrumentation
import com.abnamro.apps.referenceandroid.R

class SettingsScreen {

    var settingsMenuTitle = "Settings"

    fun clickSettingsButton() {

        //This opens the settings menu bar. The settings menu is not part of the activity_main layout. By using this action it opens the menu that is present.
        openActionBarOverflowOrOptionsMenu(getInstrumentation().targetContext)
        //Clicks menu
        onView(withText(settingsMenuTitle)).perform(click())

    }

}