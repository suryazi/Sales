package com.sales

class Orders {
    
    Customer customer
    Salesman salesman
    Date odate

    static constraints = {
        customer blank:false
        salesman blank:false
        odate blank:false
    }
    static hasMany=[orderdetails:Orderdetail]
    static belongsTo=Salesman
    String toString(){
        "${id}:${customer}-${salesman}"
    }
}
