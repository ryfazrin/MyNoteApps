package com.ryfazrin.mynoteapps

import android.content.Context
import com.ryfazrin.mynoteapps.db.DatabaseContract.NoteColumns
import com.ryfazrin.mynoteapps.db.DatabaseContract.NoteColumns.Companion.TABLE_NAME

internal class DatabaseHelper(context: Context) {

    companion object {

        private const val DATABASE_NAME = "dbnoteapp"

        private const val DATABASE_VERSION = 1

        private const val SQL_CREATE_TABLE_NOTE = "CREATE TABLE $TABLE_NAME" +
                "(${NoteColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT," +
                "${NoteColumns.TITLE} TEXT NOT NULL, " +
                "${NoteColumns.DESCRIPTION} TEXT NOT NULL" +
                "${NoteColumns.DATE} TEXT NOT NULL)"
    }
}