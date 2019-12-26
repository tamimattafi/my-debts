package com.tamimattafi.mydebts.common.utils

import java.text.SimpleDateFormat
import java.util.*
import java.util.Calendar.*

object DateUtils {

    const val SIMPLE_DATE_PATTERN: String = "dd.MM.yyyy"

    fun Date?.toStringDate(pattern: String): String = this?.run {
        SimpleDateFormat(pattern, Locale.getDefault()).format(this)
    } ?: "～"

    fun Long.toStringDate(pattern: String): String = toDate().toStringDate(pattern)

    fun Long.toDate(): Date? = Date(this).takeIf { this > 0 }

    fun getTodayTime(): Long = getInstance().apply {
        keepDayOnly()
    }.time.time

    fun Calendar.keepDayOnly() {
        set(MILLISECOND, 0)
        set(SECOND, 0)
        set(MINUTE, 0)
        set(HOUR, 0)
    }
}