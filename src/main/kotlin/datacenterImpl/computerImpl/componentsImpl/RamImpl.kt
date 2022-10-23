package datacenterImpl.computerImpl.componentsImpl

import datacenter.computer.components.BigRam
import datacenter.computer.components.Ram
import javax.inject.Inject

class Ram16GB @Inject constructor(): Ram, BigRam {
    override fun open() {
        println("16GB of ram is open")
    }
}