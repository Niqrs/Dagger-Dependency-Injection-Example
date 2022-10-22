package datacenter.computer

import datacenter.computer.components.Disk
import datacenter.computer.components.Processor
import datacenter.computer.components.Ram

abstract class Computer(
    val processor: Processor,
    val ram: Ram,
    val disk: Disk
){
    abstract fun start()
}