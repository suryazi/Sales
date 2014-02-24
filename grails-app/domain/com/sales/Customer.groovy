package com.sales

class Customer {
    
    String name
    String address

    static constraints = {
        name size:1..25, blank:false, unique:true
        address nullable:true
    }
    
    String toString(){
        "${name}"
    }
}