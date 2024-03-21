package jolchu.tolik.weatherappjetpack.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import jolchu.tolik.weatherappjetpack.data.mappers.toWeatherInfo
import jolchu.tolik.weatherappjetpack.data.remote.WeatherApi
import jolchu.tolik.weatherappjetpack.domain.repository.WeatherRepository
import jolchu.tolik.weatherappjetpack.domain.util.Resource
import jolchu.tolik.weatherappjetpack.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
) : WeatherRepository {
    @RequiresApi(Build.VERSION_CODES.O)
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch (e: Exception) {
            Resource.Error(e.message ?: "An unknown error occurred")
        }
    }

}