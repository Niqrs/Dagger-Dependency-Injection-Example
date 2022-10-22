import di.AppComponent
import di.DaggerAppComponent


fun main() { // WITH DEPENDENCY INJECTION
    val dagger: AppComponent = DaggerAppComponent.create()

    val dataCenter = dagger.flexibleDataCentre()

    dataCenter.launch()
}