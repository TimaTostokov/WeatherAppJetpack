package jolchu.tolik.weatherappjetpack.domain.repository

import jolchu.tolik.weatherappjetpack.domain.util.Resource
import jolchu.tolik.weatherappjetpack.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, lon: Double): Resource<WeatherInfo>
}