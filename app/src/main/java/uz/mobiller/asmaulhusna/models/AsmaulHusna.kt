package uz.mobiller.asmaulhusna.models

import java.io.Serializable

class AsmaulHusna : Serializable {

    var name: String? = null
    var number: Int? = null
    var img: Int? = null

    constructor(name: String?, number: Int?, img: Int?) {
        this.name = name
        this.number = number
        this.img = img
    }
}