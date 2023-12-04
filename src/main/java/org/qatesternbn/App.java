package org.qatesternbn;

import java.time.LocalDateTime;
public class App
{
    public static void main( String[] args ) {

        Rescuer rescuer1 = new Rescuer();
        rescuer1.setName("Alex");
        rescuer1.setMoney(300);
        rescuer1.setAge(22);
        rescuer1.setSex("Man");

        Rescuer rescuer2 = new Rescuer();
        rescuer2.setName("Andreea");
        rescuer2.setMoney(500);
        rescuer2.setAge(25);
        rescuer2.setSex("Women");

        Animal animal1 = new Animal();
        animal1.setName("Dafi");
        animal1.setAge(3);
        animal1.setHealthLevel(10);
        animal1.setHungerLevel(5);
        animal1.setHappinessLevel(10);
        animal1.setHairColor("black");
        animal1.setKilogram(9.5);
        animal1.setAverageLifeExpectancy(12);
        animal1.setWaist("Littel");
        animal1.setFavoriteActivityName("Running");
        animal1.setFavoriteFoodName("Pasta");

        @SuppressWarnings("WriteOnlyObject") EntertainmentActivity activity1 = new EntertainmentActivity("Running");
        activity1.name = "Running";

        @SuppressWarnings("WriteOnlyObject") Food food1 = new Food("Pasta");
        food1.setName("Pasta");
        food1.setPrice(25.99);
        food1.setInStock(true);
        food1.setType("Salty");
        food1.setQuantity(10);
        food1.setTypeOfMeat("Beef");
        food1.setCalories(131);
        food1.setWeight(100);
        food1.setExpiryDate(LocalDateTime.of(2024, 12, 31, 12, 0, 0));


        Animal animal2 = new Animal();
        animal2.setName("Cici");
        animal2.setAge(2);
        animal2.setHealthLevel(9);
        animal2.setHungerLevel(3);
        animal2.setHappinessLevel(10);
        animal2.setHairColor("Brown");
        animal2.setKilogram(7.5);
        animal2.setAverageLifeExpectancy(11);
        animal2.setWaist("Medium");
        animal2.setFavoriteActivityName("PLay with toys");
        animal2.setFavoriteFoodName("Chicken Breast");


        @SuppressWarnings("WriteOnlyObject") EntertainmentActivity activity2 = new EntertainmentActivity("Play with toys");
        activity2.name = "Play with toys";

        @SuppressWarnings("WriteOnlyObject") Food food2 = new Food("Chicken Breast");
        food2.setName("Chicken Breast");
        food2.setPrice(32.99);
        food2.setInStock(true);
        food2.setType("Salty");
        food2.setQuantity(10);
        food2.setTypeOfMeat("Chicken");
        food2.setCalories(165);
        food2.setWeight(150);
        food2.setExpiryDate(LocalDateTime.of(2023, 12, 22, 17, 0, 0));



        MedicalStaff medic1 = new MedicalStaff();
        medic1.setName("Alina");
        medic1.setSpecialization("General Medicine");
        medic1.setSex("Women");
        medic1.setAge(33);
        medic1.setNationality("Romanian");

        MedicalStaff medic2 = new MedicalStaff();
        medic2.setName("Andrei");
        medic2.setSpecialization("General Medicine");
        medic2.setSex("Man");
        medic2.setAge(29);
        medic2.setNationality("Romanian");



        @SuppressWarnings("WriteOnlyObject") Game game = new Game();
        game.setMedic(medic1);
        game.setRescuer(rescuer1);
        game.setAnimal(animal1);
        game.setMedic(medic2);
        game.setRescuer(rescuer2);
        game.setAnimal(animal2);





    }


}
