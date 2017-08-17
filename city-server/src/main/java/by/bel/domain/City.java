package by.bel.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Arrays;

/**
 * Created by Barys_Shliaha on 18-Jul-16.
 */
//        "_id": "10280",
//                "city": "NEW YORK",
//                "state": "NY",
//                "pop": 5574,
//                "loc": [        -74.016323,        40.710537        ]

@Document(collection = "cities")
public class City {

    private Long id;
    private String city;
    private String state;
    @Field("pop")
    @JsonProperty("pop")
    private Long population;
    @Field("loc")
    @JsonProperty("loc")
    private Long[] location;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Long[] getLocation() {
        return location;
    }

    public void setLocation(Long[] location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", population=" + population +
                ", location=" + Arrays.toString(location) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city1 = (City) o;

        if (id != null ? !id.equals(city1.id) : city1.id != null) return false;
        if (city != null ? !city.equals(city1.city) : city1.city != null) return false;
        if (state != null ? !state.equals(city1.state) : city1.state != null) return false;
        if (population != null ? !population.equals(city1.population) : city1.population != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(location, city1.location);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (population != null ? population.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(location);
        return result;
    }
}




