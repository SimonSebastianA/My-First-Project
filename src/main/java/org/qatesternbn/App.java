package org.qatesternbn;

import java.time.LocalDateTime;
public class App 
{
    public static void main( String[] args ) {

        Rescuer rescuer1 = new Rescuer();
        rescuer1.name = "Alex";
        rescuer1.money = 300;
        rescuer1.age = 22;
        rescuer1.sex = "Man";

        Rescuer rescuer2 = new Rescuer();
        rescuer2.name = "Andreea";
        rescuer2.money = 500;
        rescuer2.sex = "Women";
        rescuer2.age = 25;

        Animal animal1 = new Animal();
        animal1.name = "Dafi";
        animal1.age = 3;
        animal1.healthLevel = 10;
        animal1.hungerLevel = 5;
        animal1.happinessLevel = 10;
        animal1.hairColor = "Black";
        animal1.kilogram = 9.5;
        animal1.AverageLifeExpectancy = 12;
        animal1.Waist = "Littel";
        animal1.favoriteActivityName = "Running";
        animal1.favoriteFoodName = "Pasta";

        EntertainmentActivity activity1 = new EntertainmentActivity("Running");
        activity1.name = "Running";

        Food food1 = new Food("Pasta");
        food1.name = "Pasta";
        food1.price = 25.99;
        food1.inStock = true;
        food1.type = "Salty";
        food1.typeOfMeat = "Beef";
        food1.calories = 131;
        food1.weight = 100;
        food1.expiryDate = LocalDateTime.of(2024, 12, 31, 12, 0, 0);

        Animal animal2 = new Animal();
        animal2.name = "Cici";
        animal2.age = 2;
        animal2.healthLevel = 9;
        animal2.hungerLevel = 3;
        animal2.happinessLevel = 10;
        animal2.hairColor = "Brown";
        animal2.kilogram = 7.5;
        animal2.AverageLifeExpectancy = 11;
        animal2.Waist = "Medium";
        animal2.favoriteActivityName = "Play with toys";
        animal2.favoriteFoodName = "Chicken Breast";


        EntertainmentActivity activity2 = new EntertainmentActivity("Play with toys");
        activity2.name = "Play with toys";

        Food food2 = new Food("Chicken Breast");
        food2.name = "Chicken Breast";
        food2.price = 32.99;
        food2.inStock = true;
        food2.type = "Salty";
        food2.typeOfMeat = "Chicken";
        food2.calories = 165;
        food2.weight = 150;
        food2.expiryDate = LocalDateTime.of(2023, 12, 22, 17, 0, 0);


        MedicalStaff medic1 = new MedicalStaff();
        medic1.name = "Alina";
        medic1.specialization ="General Medicine";
        medic1.sex = "Women";
        medic1.age = 33;
        medic1.Nationality = "Romanian";

        MedicalStaff medic2 = new MedicalStaff();
        medic2.name = "Andrei";
        medic2.specialization = "General Medicine";
        medic2.sex = "Man";
        medic2.Nationality = "Romanien";
        medic2.age = 29;


        Game game = new Game();
        game.rescuer = rescuer1;
        game.medic = medic2;
        game.rescuer = rescuer2;
        game.animal = animal2;
        game.animal = animal1;
        game.medic = medic1;




    }


}
