package com.abnamro.apps.referenceandroid.tests

import org.junit.Test
import com.abnamro.apps.referenceandroid.pages.MailScreen

/**
 *  Script in Kotlin.
 *  Page object model implementation.
 *
 */

//Send Email Test extended by BaseTest
class SendEmailTest : BaseTest() {

    var mailScreen = MailScreen()

    //Test clicks on Mail button through use of searching for id and action click. Comes from page object class MailScreen
    @Test
    fun testShowSendMailText() {
        mailScreen.showSendMailText()

    }
}