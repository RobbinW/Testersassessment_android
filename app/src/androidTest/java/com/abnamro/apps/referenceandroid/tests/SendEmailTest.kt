package com.abnamro.apps.referenceandroid.tests

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.abnamro.apps.referenceandroid.MainActivity
import com.abnamro.apps.referenceandroid.R
import org.junit.Rule
import org.junit.Test
import com.abnamro.apps.referenceandroid.pages.MailScreen

/**
 *  Script in Kotlin.
 *  Page object model implementation.
 *
 */

//Send Email Test extended by BaseTest
class SendEmailTest : BaseTest() {

    var MailScreen = MailScreen()

    //Test clicks on Mailbutton through use of searching for id and action click. Comes from page object class MailScreen
    @Test
    fun testShowSendMailText() {
        MailScreen.showSendMailText()

    }
}