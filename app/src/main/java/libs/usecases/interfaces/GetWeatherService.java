package libs.usecases.interfaces;

import libs.domain.core.Weather;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetWeatherService {

    //https://api.darksky.net/forecast/1260689d2c7f75b7c97f8fb8a4cb1d19/42.3601,-71.0589?lang=ru&exclude=daily,icon,minutely,flags,minutely
    @GET("?lang=ru&exclude=daily,icon,minutely,flags,minutely")
    Call<Weather> getWeather();
}
