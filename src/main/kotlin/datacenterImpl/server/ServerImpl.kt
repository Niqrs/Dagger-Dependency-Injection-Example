package datacenterImpl.server

import datacenter.computer.Computer
import datacenter.computer.FastComputer
import datacenter.computer.SlowComputer
import datacenter.server.Server

class SmallSlowServer(
    private val serverComputer: SlowComputer //Shared Computer
): Server {
    override fun runServer() {
        println("launching small server...")
        serverComputer.start()
        println("server is launched")
    }
}

class MediumServer(
    private val serverComputer1: SlowComputer, //Shared Computer
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