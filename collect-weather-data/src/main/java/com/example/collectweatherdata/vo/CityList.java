package com.example.collectweatherdata.vo;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author CookiesEason
 * 2018/04/19 22:22
 */
@Data
public class CityList {
    List<City> cityList;
}
