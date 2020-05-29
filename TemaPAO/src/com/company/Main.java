package com.company;

import services.ClientServiceInOut;

public class Main {


    public static void main(String[] args) {
        System.out.println("A functionat la un moment scrierea in csv, dar am modificat ceva intr-o clasa si nu mai stiu cum sa fac inapoi...");
        ClientServiceInOut clientServiceInOut = ClientServiceInOut.getInstance();
        clientServiceInOut.saveClients();
    }
}
