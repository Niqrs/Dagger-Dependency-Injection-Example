package di

import dagger.Module
import dagger.Provides
import datacenterImpl.FlexibleDataCenter
import datacenterImpl.computerImpl.FastComputer
import datacenterImpl.computerImpl.SlowComputer
import datacenterImpl.computerImpl.componentsImpl.*
import datacenterImpl.serverImpl.MediumServer
import datacenterImpl.serverImpl.SmallSlowServer
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideSlowComputer(
        processor: IntelPentium,
        ram: Ram16GB,
        disk: HddDisk
    ) = SlowComputer( // Shared computer
        processor,
        ram,
        disk
    )

    @Provides
    fun provideFastComputer(
        processor: Ryzen7,
        ram: Ram16GB,
        disk: SsdDisk
    ) = FastComputer(
        processor,
        ram,
        disk
    )

    @Provides
    fun provideSmallSlowServer(
        serverComputer: SlowComputer
    ) = SmallSlowServer(
        serverComputer
    )

    @Provides
    fun provideMediumServer(
        serverComputer1: SlowComputer,
        serverComputer2: FastComputer
    ) = MediumServer(
        serverComputer1,
        serverComputer2
    )


    @Provides
    fun flexibleDataCenter(
        server1: SmallSlowServer,
        server2: MediumServer
    ): FlexibleDataCenter = FlexibleDataCenter(server1, server2)
}