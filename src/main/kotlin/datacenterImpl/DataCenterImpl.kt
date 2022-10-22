package datacenterImpl

import datacenter.DataCenter
import datacenterImpl.serverImpl.MediumServer
import datacenterImpl.serverImpl.SmallSlowServer
import javax.inject.Inject

class FlexibleDataCenter @Inject constructor( // It's not really 'flexible'
    val server1: SmallSlowServer,
    val server2: MediumServer
): DataCenter {

    override fun launch() {
        println("DATA CENTER is launching...")
        server1.runServer()
        server2.runServer()
        println("DATA CENTER is launched")
    }
}