package datacenter.computer.components

interface Processor {
    fun run()
}

interface AmdProcessor: Processor
interface IntelProcessor: Processor
interface  SlowProcessor: Processor
interface FastProcessor: Processor