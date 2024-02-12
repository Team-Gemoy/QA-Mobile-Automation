package helpers;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class randomData {
    static Faker faker = new Faker(new Locale("ID"));
    public static String getFirstName() {
        return faker.name().firstName();
    }

    public static String getLastName() {
        return faker.name().lastName();
    }

    public static String getFullname() {return faker.name().fullName();
    }

    public static String getNationality() {
        return faker.country().name();
    }
    public static String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(faker.date().birthday());
    }

    public static String getDateNow() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(faker.date().past(3, TimeUnit.DAYS));
    }
    public static String getEmail() {
        return faker.internet().emailAddress();
    }

    public static String getCity() {
        return faker.address().cityName();
    }

    public static String getPhoneNumber() {
        return "08" + faker.numerify("##########");
    }

    static List<String> indexList = Arrays.asList("Male", "Female");
    static Random random = new Random();
    public static String getGender() {
        return indexList.get(random.nextInt(indexList.size()));
    }

}