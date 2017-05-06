package com.luoxiao.weather_client;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

public class ClientTest {
	
	public static void main(String[] args) {
		WeatherWS weatherWS = new WeatherWS();
		//得到代理对象
		WeatherWSSoap weatherWSSoap = weatherWS.getWeatherWSSoap();
		ArrayOfString weather =  weatherWSSoap.getWeather("武汉", null);
		List<String> list = weather.getString();
		System.out.println(list);
	}
}
