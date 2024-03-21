package jolchu.tolik.weatherappjetpack.presentation

import jolchu.tolik.weatherappjetpack.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)