package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {

    public static void main(String[] args) {
        String localHost = "http://localhost:8085";
        String rootEndpointStock = "/WineStockService";
        String rootEndpointWarn = "/WineWarningService";

        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();
        WineWarningServiceImplementation wineWarning = new WineWarningServiceImplementation();

        System.out.println("Publicando WebService . . .");

        Endpoint.publish(localHost + rootEndpointStock, wineStock);

        System.out.println("Serviço WineStockService publicado!");

        Endpoint.publish(localHost + rootEndpointWarn, wineWarning);

        System.out.println("Serviço WineWarningService publicado!");
    }

}
