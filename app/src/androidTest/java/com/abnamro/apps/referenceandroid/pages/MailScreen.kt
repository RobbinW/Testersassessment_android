package com.abnamro.apps.referenceandroid.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.abnamro.apps.referenceandroid.R

//(Future) mail screen extended by BaseScreen
class MailScreen : BaseScreen() {

    //variable mailButton, used for functions
    var mailButton = onView(withId(R.id.fab))

    //function click Mail Button
    fun clickMailButton() {
        mailButton.perform(ViewActions.click())
    }

}