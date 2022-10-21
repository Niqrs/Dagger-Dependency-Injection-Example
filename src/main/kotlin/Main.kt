import datacenter.computer.FastComputer
import datacenter.computer.SlowComputer
import datacenterImpl.FlexibleDataCenter
import datacenterImpl.server.MediumServer
import datacenterImpl.server.SmallSlowServer
import datacenterImpl.computerImpl.*

fun main() { // WITHOUT DEPENDENCY INJECTION
    val slowProcessor = IntelPentium()
    val fastProcessor = Ryzen7()

    val bigRam = Ram16GB()

    val slowDisk = HddDisk()
    val fastDisk = SsdDisk()

    val slowComputer = SlowComputer(
        processor = slowProcessor,
        ram = bigRam,
        disk = slowDisk
        )
    val fastComputer = FastComputer(
        processor = fastProcessor,
        ram = bigRam,
        disk = fastDisk
    )

    val slowServer = SmallSlowServer(slowComputer)
    val mediumServer = MediumServer(slowComputer, fastComputer)

    val serverList = listOf(slowServer, mediumServer)

    val dataCenter = FlexibleDataCenter(serverList)

    dataCenter.launch()
}