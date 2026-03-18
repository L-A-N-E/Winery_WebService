package br.com.fiap.winery;

import br.com.fiap.winery.stubclasses.WineStockService;
import br.com.fiap.winery.stubclasses.WineWarningService;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationClient2 {
    public static void main(String[] args) throws MalformedURLException {
        String targetStock = "http://winery.fiap.com.br/";
        String nameStock = "WineStockServiceImplementationService";

        String order;

        URL urlStock = new URL("http://localhost:8085/WineStockService?wsdl");
        QName qNameStock = new QName(targetStock, nameStock);

        Service serviceStock = Service.create(urlStock, qNameStock);

        // Implementando o Stock
        WineStockService wineStockService = serviceStock.getPort(WineStockService.class);

        order = wineStockService.placeOrder("Gustav Riesling Réserve Nahe 2022", 2);

        System.out.println(order);

        // Implementando o Warn
        String targetWarn = "http://winery.fiap.com.br/";
        String nameWarn = "WineWarningServiceImplementationService";

        String warn;

        URL urlWarn = new URL("http://localhost:8085/WineWarningService?wsdl");
        QName qNameWarn = new QName(targetWarn, nameWarn);

        Service serviceWarn = Service.create(urlWarn, qNameWarn);

        WineWarningService wineWarningService = serviceWarn.getPort(WineWarningService.class);

        warn = wineWarningService.sendWarn();

        System.out.println(warn);

    }
}
