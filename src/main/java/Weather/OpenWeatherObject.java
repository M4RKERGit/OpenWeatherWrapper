package Weather;

public class OpenWeatherObject
{
    private Coord Coord;
    private Weather Weather[];
    private String Base;
    private Main Main;
    private long Visibility;
    private Wind Wind;
    private Clouds Clouds;
    private Rain Rain;
    private Snow Snow;
    private long Dt;
    private Sys Sys;
    private int Timezone;
    private long Id;
    private String Name;
    private int Cod;


    public Coord getCoord() {
        return Coord;
    }

    public void setCoord(Coord coord) {
        Coord = coord;
    }

    public Weather[] getWeather() {
        return Weather;
    }

    public void setWeather(Weather[] weather) {
        Weather = weather;
    }

    public String getBase() {
        return Base;
    }

    public void setBase(String base) {
        Base = base;
    }

    public Main getMain() {
        return Main;
    }

    public void setMain(Main main) {
        Main = main;
    }

    public long getVisibility() {
        return Visibility;
    }

    public void setVisibility(long visibility) {
        Visibility = visibility;
    }

    public Wind getWind() {
        return Wind;
    }

    public void setWind(Wind wind) {
        Wind = wind;
    }

    public Clouds getClouds() {
        return Clouds;
    }

    public void setClouds(Clouds clouds) {
        Clouds = clouds;
    }

    public Rain getRain() {
        return Rain;
    }

    public void setRain(Rain rain) {
        Rain = rain;
    }

    public Snow getSnow() {
        return Snow;
    }

    public void setSnow(Snow snow) {
        Snow = snow;
    }

    public long getDt() {
        return Dt;
    }

    public void setDt(long dt) {
        Dt = dt;
    }

    public Sys getSys() {
        return Sys;
    }

    public void setSys(Sys sys) {
        Sys = sys;
    }

    public int getTimezone() {
        return Timezone;
    }

    public void setTimezone(int timezone) {
        Timezone = timezone;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCod() {
        return Cod;
    }

    public void setCod(int cod) {
        Cod = cod;
    }

}

