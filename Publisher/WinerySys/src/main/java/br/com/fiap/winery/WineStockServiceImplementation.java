package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        return """
                Vinhos Disponiveis:
                    * DeAngeli Barolo DOCG 2021
                        -> Tipo: Vinho Tinto
                        -> Pais: Itália
                        -> Uva: Nebbiolo
                        -> Valor: R$429,90
           
                    * Radal Reserve Cabernet Sauvignon
                        -> Tipo: Vinho Tinto
                        -> Pais: Chile
                        -> Uva: Cabernet Sauvignon
                        -> Valor: R$139,90
                        
                    * Gustav Riesling Réserve Nahe 2022
                        -> Tipo: Vinho Branco
                        -> Pais: Alemanha
                        -> Uva: Riesling
                        -> Valor: R$149,90
                        
                    * Gran Anciano Seleccion Especial Tempranillo
                        -> Tipo: Vinho Tinto
                        -> Pais: Espanha
                        -> Uva: Tempranillo
                        -> Valor: R$129,90
                """;
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido Confirmado!";
    }
}
