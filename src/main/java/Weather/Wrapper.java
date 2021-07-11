package Weather;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Wrapper
{
    private String token, language;
    public String getToken() {return token;}
    public void setToken(String token) {this.token = token;}
    public String getLanguage() {return language;}
    public void setLanguage(String language) {this.language = language;}

    public Wrapper(String recToken, String recLan) {this.token = recToken; this.language = recLan;}

    public OpenWeatherObject getWrap(String city)
    {
        String linkAddr = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&APPID=" + this.token + "&lang=" + this.language;
        return getJson(linkAddr);
    }

    public OpenWeatherObject getWrap(float longitude, float latitude)
    {
        String linkAddr = "https://api.openweathermap.org/data/2.5/weather?lat=" + latitude + "&lon=" + longitude + "&APPID=" + this.token + "&lang=" + this.language;
        return getJson(linkAddr);
    }

    private OpenWeatherObject getJson(String linkAddr)
    {
        String output;
        OpenWeatherObject toRet = null;
        try
        {
            HttpURLConnection conTar = (HttpURLConnection) new URL(linkAddr).openConnection();
            conTar.connect();
            Scanner rec = new Scanner(conTar.getInputStream());
            output = rec.nextLine();
            conTar.disconnect();
        }
        catch (IOException e)
        {
            System.out.println("Parse error");
            return null;
        }
        ObjectMapper JSONMapper = new ObjectMapper();
        try {toRet = JSONMapper.readValue(output, OpenWeatherObject.class);}
        catch (JsonProcessingException e) {e.printStackTrace(); System.out.println("Wrapping failed");}
        return toRet;
    }
}
