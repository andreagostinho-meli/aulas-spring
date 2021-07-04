package br.com.meli.apipedidosrestaurante.controllers;

import br.com.meli.apipedidosrestaurante.dto.CashierDTO;
import br.com.meli.apipedidosrestaurante.dto.OrderDTO;
import br.com.meli.apipedidosrestaurante.dto.PlateDTO;
import br.com.meli.apipedidosrestaurante.dto.TableDTO;
import br.com.meli.apipedidosrestaurante.services.CashierService;
import br.com.meli.apipedidosrestaurante.services.OrderService;
import br.com.meli.apipedidosrestaurante.services.PlateService;
import br.com.meli.apipedidosrestaurante.services.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api")
public class RestaurantController {
    @Autowired
    private PlateService plateService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private TableService tableService;
    @Autowired
    private CashierService cashierService;

    @PostMapping("/plate")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public PlateDTO createPlate(@RequestBody PlateDTO plate) {
        return plateService.create(plate);
    }

    @PostMapping("/order")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public OrderDTO createOrder(@RequestBody OrderDTO order) {
        OrderDTO newOrder = orderService.create(order);
        tableService.addOrder(order.getTableId(), order);

        return newOrder;
    }

    @PostMapping("/table")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public TableDTO createTable(@RequestBody TableDTO table) {
        return tableService.create(table);
    }

    @GetMapping("/table/{id}")
    @ResponseBody
    public TableDTO findTableById(@PathVariable int id) {
        TableDTO table = tableService.findById(id);
        if(table == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return table;
    }

    @PostMapping("/table/{id}/close")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void closeTable(@PathVariable int id) {
        TableDTO table = tableService.findById(id);
        if(table == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        cashierService.addCash(table.getTotal());
        tableService.close(table);
    }

    @GetMapping("/cashier/balance")
    @ResponseBody
    public CashierDTO getCashierBalance() {
        return cashierService.getBalance();
    }
}
