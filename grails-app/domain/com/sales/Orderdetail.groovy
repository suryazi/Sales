package com.sales

class Orderdetail {
    
    Orders orders
    Item items
    Integer qty

    static constraints = {
        orders blank:false
        items blank:false
        qty min:1
    }
    static belongsTo=Orders
}