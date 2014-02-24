package com.sales

class Item {
    
    String name
    Integer price

    static constraints = {
        name size:1..25, blank:false, unique:true
        price min:1
    }
    
    String toString(){
        "${name}"
    }
}
