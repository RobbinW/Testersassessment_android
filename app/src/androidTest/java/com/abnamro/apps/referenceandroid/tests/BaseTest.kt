package com.abnamro.apps.referenceandroid.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.abnamro.apps.referenceandroid.MainActivity
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
open class BaseTest {

    @Rule
    @JvmField
    val activity = ActivityScenarioRule(MainActivity::class.java)

}