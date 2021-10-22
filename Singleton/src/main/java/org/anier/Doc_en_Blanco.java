package org.anier;

import java.util.ArrayList;

public class Doc_en_Blanco
{

    private static Doc_en_Blanco _instance = null;

    private <Documento> Doc_en_Blanco()
    {
        ArrayList<Documento> Documento = new ArrayList<Documento>();
    }

    public static Doc_en_Blanco Instance()
    {
        if (_instance == null)
            _instance = new Doc_en_Blanco();
        return _instance;
    }

}
