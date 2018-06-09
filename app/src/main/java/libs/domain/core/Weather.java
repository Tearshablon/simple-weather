package libs.domain.core;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Weather {
    private Double latitude;
    private Double longitude;
    private String timezone;
    private List<CurrentlyWeather> currently;
    private List<HourlyWeather> hourly;
    private Integer offset;
}
