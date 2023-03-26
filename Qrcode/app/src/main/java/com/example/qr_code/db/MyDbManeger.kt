package com.example.qr_code.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.icu.text.CaseMap.Title

class MyDbManeger(val context: Context) {
    val MyDbHelper = MyDbHelper(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = MyDbHelper.writableDatabase
    }
    fun insertToDo(title: String, content: String ){
        val values = ContentValues().apply {
            put(db_main_class.COLUMN_NAME_TITLE, title)
            put(db_main_class.COLUMN_NAME_CONTENT, content)
        }
        db?.insert(db_main_class.TABLE_NAME, null, values)
    }
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
         val cursor = db?.query(db_main_class.TABLE_NAME, null, null, null, null, null, null)
         while (cursor?.moveToNext()!!){
             val dataText = cursor.getString(cursor.getColumnIndex(db_main_class.COLUMN_NAME_TITLE))
             dataList.add(dataText.toString())
            }

        cursor.close()
        return dataList
    }
    fun closeDb(){
        MyDbHelper.close()
    }


}