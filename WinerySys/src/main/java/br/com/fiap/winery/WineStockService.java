package br.com.fiap.winery;

import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface WineStockService {


    public String getMenu();

    public String placeOrder(String name, int quantity);



}
