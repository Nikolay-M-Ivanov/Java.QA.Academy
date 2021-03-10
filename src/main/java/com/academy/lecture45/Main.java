package com.academy.lecture45;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
@Slf4j

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();

        //Elena=11;Alex=4  - трябва да превърнем този вид в долния и след това да работим с всеки елемент
        //Elena, 11, Alex, 4
        String[] peopleTokens = reader.readLine().split("[;=]");

        //Coffee=10;Tea=2
        //Coffee, 10, Tea, 2
        String[] productTokens = reader.readLine().split("[;=]");

        for (int i = 0; i < peopleTokens.length; i += 2) {
            Person person = new Person(peopleTokens[i], Double.parseDouble(peopleTokens[i + 1]));
            people.putIfAbsent(person.getName(), person);
        }

        for (int i = 0; i < productTokens.length; i += 2){
            Product product = new Product(productTokens[i], Double.parseDouble(productTokens[i+1]));
            products.putIfAbsent(product.getName(), product);
        }

        String line;
        while (true){
            if ("end".equalsIgnoreCase(line=reader.readLine())){
                break;
            }
            //Alex Tea                           //   "\\s+" е същото като спейс " "
            String[] purchaseTokens = line.split("\\s+");
            String personName = purchaseTokens[0];
            String productName = purchaseTokens[1];

            Person person = people.get(personName);
            Product product = products.get(productName);

            if (people.containsKey(personName) && products.containsKey(productName)){
                if (person.hasEnoughMoney(product.getCost())){
                    person.buyProduct(product);
                    log.info("{} bought {}", person.getName(), product.getName());
                } else {
                    log.error("{} can not afford {}", person.getName(), product.getName());
                }
            }
        }
        people.values().forEach(System.out::println);
    }
}
