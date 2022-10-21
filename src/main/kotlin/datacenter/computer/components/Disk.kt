package datacenter.computer.components

interface Disk {
    val freeSpace: Int
    fun init()
}

interface SSD: Disk
interface HDD: Disk