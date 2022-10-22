package datacenterImpl.serverImpl

import datacenter.computer.Computer
import datacenter.server.Server
import datacenterImpl.computerImpl.FastComputer
import datacenterImpl.computerImpl.SlowComputer
import javax.inject.Inject

class SmallSlowServer @Inject constructor(
    private val serverComputer: SlowComputer
): Server {
    override fun runServer() {
        println("launching small server...")
        serverComputer.start()
        println("server is launched")
    }
}

class MediumServer @Inject constructor(
    private val serverComputer1: SlowComputer,
    private val serverComputer2: FastComputer
): Server {

    override fun runServer() {
        println("launching medium server...")
        launchComputer(serverComputer1)
        launchComputer(serverComputer2)
        println("server is launched")
    }

    private fun launchComputer(computer: Computer) {
        println("launching computer...")
        computer.start()
        println("computer is launched")
    }
}