package com.company;

public class Main {

    public static void main(String[] args) {
        // Automatic Conversion.
        //Conversions that do not cause any data loss
        //Byte to short
        byte value_byte = 124;
        short value_short = value_byte;
        System.out.println("New value of short from byte is (value_short): " + value_short);


        // byte to float
        float value_float = value_byte;


        //Conversions that cause data loss

        //int to float
        int value_of_int = 123456789;
        float value_of_float = value_of_int;
        System.out.println("New value of float from int 123456789 is (value_0f_float): " + value_of_float);

        int money_deposited = 123456789;
        float converted_value_of_deposit = money_deposited;
        System.out.println("Money deposited in float is: " + converted_value_of_deposit);

        //long to float
        long value_of_long = 20134677979709790L;
        float newValueOfFloat = value_of_long;
        System.out.println("New value of float from long 20134677979709790L is (newValueOfFloat): " + newValueOfFloat);

        //Long to double
        double value_of_double = value_of_long;
        System.out.println("New value of double from long 20134677979709790L is (value_of_double): " + value_of_double);

        //Casting.Conversions where information can be lost are called casting
        //double to float
        double available_balance = 99.9989;
        float float_available_balance = (float) available_balance;
        System.out.println("available balance in float: " +float_available_balance);

        //double to long
        long long_available_balance = (long) available_balance;
        System.out.println("Available balance in long: " + long_available_balance);

        //class work

        //double to int
        double double_available_balance = 16.9899;
        int int_available_balance =  (int) double_available_balance;
        System.out.println("Double available balance in int: " + int_available_balance);

        // float to int
        float float_availableBalance = 156789;
        int int_availableBalance = (int) float_availableBalance;
        System.out.println("float to int:" +int_availableBalance);

        //long to int
        long long_availableBalance = 123456789L;
        int intAvailableBalance = (int) long_availableBalance;
        System.out.println("Long to int available balance:" + intAvailableBalance);



    }
}
