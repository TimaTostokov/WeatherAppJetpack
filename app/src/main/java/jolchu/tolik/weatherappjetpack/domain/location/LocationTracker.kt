package jolchu.tolik.weatherappjetpack.domain.location

import android.location.Location

interface LocationTracker {
    suspend fun getCurrentLocation(): Location?

}