package libs.domain.core;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class BaseWeather {

    private Long time;
    private String summary;
    private String icon;
    private Long precipIntensity;
    private Long precipProbability;
    private Double temperature;
    private Double apparentTemperature;
    private Double dewPoint;
    private Double humidity;
    private Double pressure;
    private Double windSpeed;
    private Double windGust;
    private Long windBearing;
    private Double cloudCover;
    private Long uvIndex;
    private Long visibility;
    private Double ozone;
}
