package com.example.crud_ejemplo_01.Controllers;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.example.crud_ejemplo_01.Database.DatabaseHelper;
import com.example.crud_ejemplo_01.Models.Personas;

public class PersonasController
{
    private final DatabaseHelper databaseHelper;

    public PersonasController(Context context)
    {
        databaseHelper = new DatabaseHelper(context);
    }
}