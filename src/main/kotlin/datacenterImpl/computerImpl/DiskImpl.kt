package datacenterImpl.computerImpl

import datacenter.computer.components.Disk
import datacenter.computer.components.HDD
import datacenter.computer.components.SSD

class SsdDisk(override val freeSpace: Int = 512): Disk, SSD {
    override fun init() {
        println("SSD with free space: $freeSpace in initialized")
    }

}

class HddDisk(override val freeSpace: Int = 2048): Disk, HDD {
    override fun init() {
        println("HDD with free space: $freeSpace in initialized")
    }

}