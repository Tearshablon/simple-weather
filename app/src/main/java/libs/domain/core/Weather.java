package libs.domain.core;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Weather {

    private Double latitude;
    private Double longitude;
    private String timezone;
    private List<CurrentlyWeather> currently;
    private List<HourlyWeather> hourly;
    private Integer offset;
}
