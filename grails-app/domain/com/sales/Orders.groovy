package com.sales

class Orders {
    
    Customer customer
    Salesman salesman

    static constraints = {
        customer blank:false
        salesman blank:false
    }
    static hasMany=[orderdetails:Orderdetail]
    static belongsTo=Salesman
    String toString(){
        "${customer} - ${salesman}"
    }
}
