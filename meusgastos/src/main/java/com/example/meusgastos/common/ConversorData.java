package com.example.meusgastos.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConversorData {
    public static String converterDataParaDataHora(Date data){
        SimpleDateFormat fomatador = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
        return fomatador.format(data);
    }
}
