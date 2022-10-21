package datacenterImpl

import datacenter.DataCenter
import datacenter.server.Server

class FlexibleDataCenter(private val serverList: List<Server>): DataCenter {

    override fun launch() {
        println("DATA CENTER is launching...")
        serverList.forEach { it.runServer() }
        println("DATA CENTER is launched")
    }
}