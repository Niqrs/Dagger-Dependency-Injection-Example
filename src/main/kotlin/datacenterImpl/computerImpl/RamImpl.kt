package datacenterImpl.computerImpl

import datacenter.computer.components.BigRam
import datacenter.computer.components.Ram

class Ram16GB: Ram, BigRam {
    override fun open() {
        println("16GB of ram is open")
    }
}