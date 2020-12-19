package com.devdanielleguizamon.piloto01.presentation.extensions

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText

fun EditText.onTextChange(text: (String) -> Unit) {
    addTextChangedListener(object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(startText: CharSequence?, start: Int, before: Int, count: Int) {
            text.invoke(startText?.toString() ?: "")
        }

        override fun afterTextChanged(s: Editable?) {}
    })
}