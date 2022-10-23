package datacenterImpl.computerImpl.componentsImpl

import datacenter.computer.components.*
import javax.inject.Inject
import kotlin.random.Random

class Ryzen7 @Inject constructor(): Processor, AmdProcessor, FastProcessor {
    private val key: Int = Random.nextInt(1, 1000)
    override fun run() {
        println("run AMD with key: $key")
    }
}

class IntelPentium @Inject constructor(): Processor, IntelProcessor, SlowProcessor {
    private val serialNumber: Int = Random.nextInt(1, 10000)
    override fun run() {
        println("run INTEL with serial number: $serialNumber")
    }
}