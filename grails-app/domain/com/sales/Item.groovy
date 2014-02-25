package com.sales

class Item {
    
    String name
    Double price

    static constraints = {
        name size:1..25, blank:false, unique:true
        price size:1..100000
    }
    
    String toString(){
        "${name}"
    }
}
