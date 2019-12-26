package com.tamimattafi.mydebts.model.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.tamimattafi.mydebts.model.database.DatabaseValues.Tables.DEBTS_TABLE

@Entity(tableName = DEBTS_TABLE)
data class Debt(
    @PrimaryKey val id: Long? = null,
    var sum: String,
    var currency: String,
    var person: String,
    var isDebtor: Boolean,
    var date: Long,
    var creationDate: Long = System.currentTimeMillis()
) {
    object Sortables {
        const val CREATION_DATE = "creationDate"
        const val DATE = "date"
        const val IS_DEBTOR = "isDebtor"
    }
}
