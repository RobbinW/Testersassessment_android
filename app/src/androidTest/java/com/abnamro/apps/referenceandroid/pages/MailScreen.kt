package com.abnamro.apps.referenceandroid.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.abnamro.apps.referenceandroid.R

//(Future) mail screen extended by BaseScreen
class MailScreen : BaseScreen() {

    //variables, used for functions
    var mailButton = onView(withId(R.id.fab))
    var mailText = onView(withId(R.id.snackbar_text))

    //function click Mail Button
    fun showSendMailText() {

        mailButton.perform(ViewActions.click())

        mailText.check(matches(withText("Replace with your own action")))
    }

}