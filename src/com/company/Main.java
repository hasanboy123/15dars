package com.company;

public class Main {

    public static void main(String[] args) {
        Country country = new Country();
        country.setCapitalCity("Bishkek");
        country.setName("Kirgiziya");
        country.setPopulation(1088900);
        country.setWealth(12000000);
        System.out.println(country.getCapitalCity() + country.getName() + country.getPopulation() + country.getWealth());
            }
        }


