package com;

import com.house.CivilEngineer;
import com.house.House;
import com.house.HouseBuilder;
import com.house.IglooHouseBuilder;

public class Builder {

    public static void main(String[] args)
    {
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);

        engineer.constructHouse();

        House house = engineer.getHouse();

        System.out.println("Builder constructed: "+ house);
    }
}
