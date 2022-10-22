package datacenterImpl.computerImpl

import datacenter.computer.Computer
import datacenter.computer.components.*

class SlowComputer(processor: SlowProcessor, ram: BigRam, disk: HDD) : Computer(processor, ram, disk) {
    override fun start() {
        println("FAST CPU:")
        processor.run()
        println("FAST RAM:")
        ram.open()
        println("FAST DISK:")
        disk.init()
    }
}

class FastComputer(processor: FastProcessor, ram: BigRam, disk: SSD) : Computer(processor, ram, disk) {
    override fun start() {
        println("SLOW CPU:")
        processor.run()
        println("SLOW RAM:")
        ram.open()
        println("SLOW DISK:")
        disk.init()
    }
}