package com.example.qr_code.db

import android.provider.BaseColumns

object db_main_class : BaseColumns{
    const val TABLE_NAME = "table"
    const val COLUMN_NAME_TITLE = "title"
    const val COLUMN_NAME_CONTENT = "subtitle"
    const val DATABASE_VERSION = 1
    const val DATABASE_NAME = "base.db"

    const val CREATE_TABLE = "CREATE TABLE IF NOT EXISTS $TABLE_NAME (" +
            "${BaseColumns._ID} INTEGER PRIMERY KEY,$COLUMN_NAME_TITLE TEXT, $COLUMN_NAME_CONTENT TEXT)"

    const val SQL_DELETE_TABLE = "DROP TABLE IF EXISTS $TABLE_NAME"
}