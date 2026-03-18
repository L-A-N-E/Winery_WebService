package br.com.fiap.winery;

import br.com.fiap.winery.stubclasses.WineStockService;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationClient1 {
    public static void main(String[] args) throws MalformedURLException {
        String menu;

        String targetNameSpace = "http://winery.fiap.com.br/";
        String localPart = "WineStockServiceImplementationService";

        URL url = new URL("http://localhost:8085/WineStockService?wsdl");
        QName qName = new QName(targetNameSpace, localPart);

        Service service = Service.create(url, qName);

        WineStockService wineStockService = service.getPort(WineStockService.class);

        menu = wineStockService.getMenu();

        System.out.println(menu);

    }
}
