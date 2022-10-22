package di

import dagger.Component
import datacenterImpl.FlexibleDataCenter
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun flexibleDataCentre(): FlexibleDataCenter
}