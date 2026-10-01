package com.example.crud_ejemplo_01.Database;

public class DBConfig
{
    public static final String DATABASE_NAME = "personas.db";
    public static final int DATABASE_VERSION = 1;
    private static final String TABLE_PERSONAS = "personas";

    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NOMBRES = "nombres";
    private static final String COLUMN_APELLIDOS = "apellidos";
    private static final String COLUMN_DIRECCION = "direccion";

    private static final String COLUMN_FECHANAC = "fechanac";
    private static final String COLUMN_TELEFONO = "telefono";
    private static final String COLUMN_CORREO = "correo";

    public static final String CREATE_TABLE_PERSONAS = "CREATE TABLE "
            + TABLE_PERSONAS + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT , "
            + COLUMN_NOMBRES + " TEXT NOT NULL , "
            + COLUMN_APELLIDOS + " TEXT NOT NULL , "
            + COLUMN_FECHANAC + " TEXT NOT NULL , "
            + COLUMN_DIRECCION + " TEXT, "
            + COLUMN_TELEFONO + " TEXT, "
            + COLUMN_CORREO + " TEXT )";
    public static final String DROP_TABLE_PERSONAS = "DROP TABLE IF EXISTS " + TABLE_PERSONAS;
    public static final String SELECT_TABLE_PERSONAS = "SELECT * FROM " + TABLE_PERSONAS;
}