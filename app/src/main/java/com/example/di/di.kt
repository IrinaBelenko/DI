package com.example.di

class FlexibleComputer(private val processor: Processor){
init {
    processor.compute()
}
}

interface Processor{
    fun compute()
}

class SingleCoreProcessor : Processor {
    override fun compute() {
        println("Працюю на одному ядрі")
    }
}
class MultiCoreProcessor : Processor{
    override fun compute() {
        println("Працюю на декількох ядрах")
    }
}



//fun main() {
//    FlexibleComputer(MultiCoreProcessor())
//
//}