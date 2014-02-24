package com.sales

class Salesman {
    
    String name
    String location

    static constraints = {
        name size:1..25, blank:false, unique:true
        location nullable:true
    }
    static hasMany=[orders:Order]
    
    String toString(){
        "${name}"
    }
}