package com.sf.consumerapp.helper

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager


fun hideKeyboard(activity: Activity, view: View?) {
    val imm = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager?
    imm!!.hideSoftInputFromWindow(
        view?.windowToken,
        InputMethodManager.HIDE_NOT_ALWAYS
    )
}