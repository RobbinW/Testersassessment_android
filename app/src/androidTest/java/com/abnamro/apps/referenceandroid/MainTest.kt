package com.abnamro.apps.referenceandroid

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

/**
 *  Script in Kotlin.
 *  Page object model implementation.
 *
 */

class MainTest {

    @Rule
    @JvmField
    val activity = ActivityScenarioRule(MainActivity::class.java)

    //Test clicks on Mailbutton through use of searching for id and action click
    @Test
    fun testClickMailButton() {
        onView(withId(R.id.fab)).perform(ViewActions.click())

    }
}