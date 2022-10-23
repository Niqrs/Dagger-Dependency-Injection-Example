package datacenterImpl.computerImpl.componentsImpl

import datacenter.computer.components.Disk
import datacenter.computer.components.HDD
import datacenter.computer.components.SSD
import javax.inject.Inject

open class FlexibleSsdDisk(override val freeSpace: Int): Disk, SSD {
    override fun init() {
        println("SSD with free space: $freeSpace in initialized")
    }
}

class SsdDisk @Inject constructor(): FlexibleSsdDisk(512)

open class FlexibleHddDisk(override val freeSpace: Int): Disk, HDD {
    override fun init() {
        println("HDD with free space: $freeSpace in initialized")
    }
}

class HddDisk @Inject constructor(): FlexibleHddDisk(2048)