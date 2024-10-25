package konrad.tercjak.blechat

import konrad.tercjak.blechat.bluetooth.impl.AndroidBTController
import konrad.tercjak.blechat.bluetooth.interfaces.BTController

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun providesBTController(btController: AndroidBTController): BTController
}