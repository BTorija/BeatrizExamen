package com.corenetworks.Presentacion;

import com.corenetworks.Modelo.Paquete;

import java.util.Scanner;

public class ProbarPaquete {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Paquete p1 = new Paquete();
        System.out.println("Por favor introduzca la ip de origen");
        p1.setDireccionIpOrigenrigen(teclado.nextLine());
        System.out.println("Por favor introduzca la ip de destino");
        p1.setDireccionIDestino(teclado.nextLine());
        System.out.println("Por favor introduzca el mensaje");
        p1.setMensaje(teclado.nextLine());

        System.out.println(p1.toString());
        int contadorPaquetes = p1.getMensaje().length() / 20;
        if (p1.getMensaje().length() % 20 != 0) {
            contadorPaquetes++;
        }

        p1.setContadorPaquetes(contadorPaquetes);

        for (int i = 0; i < contadorPaquetes; i++) {
            int startIndex = i * 20;
            int endIndex = Math.min((i + 1) * 20, p1.getMensaje().length());
            String subMensaje = p1.getMensaje().substring(startIndex, endIndex);
        }


        System.out.println(p1.toString());
    }
}












