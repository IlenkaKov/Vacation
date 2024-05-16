package ru.netology.Packages.services;

import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServicesTest {
    @ParameterizedTest
    @CsvFileSource(files ="src/test/resources/Vacation.csv" )
    void Vacation (int income, int expenses,int treshold,int expected){
        VacationServices services = new VacationServices();
        int actual = services.calcVacationServices(income,expenses,treshold);


        Assertions.assertEquals(expected,actual);
    }

  //  @Test
   // void month1() {
    //    VacationServices service = new VacationServices();
      //  int income = 10_000;
        //int expenses = 3_000;
       // int treshold = 20_000;
       // int expected = 3;
      //  int actual = service.calcVacationServices(income, expenses, treshold);
      //  Assertions.assertEquals(actual, expected);
    }

//@Test
// void Vacation2() {
//     VacationService service = new VacationService();
//     int income = 100_000;
//     int expenses = 60_000;
//     int threshold = 150_000;
//     int expected = 2;
//     int actual = service.calcVacationServices(income, expenses, threshold);
//     Assertions.assertEquals(expected, actual);
// }
