package jolchu.tolik.weatherappjetpack.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jolchu.tolik.weatherappjetpack.data.location.DefaultLocationTracker
import jolchu.tolik.weatherappjetpack.domain.location.LocationTracker
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton

@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
abstract class LocationModule {
    @Binds
    @Singleton
    abstract fun bindLocationTracker(defaultLocationTracker: DefaultLocationTracker):LocationTracker
}