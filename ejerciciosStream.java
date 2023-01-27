package org.example;

import java.io.IOException;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        //ej1();
        //ej2();
        //ej3();
        //ej4();
        //ej5();
        //ej6();
        //ej7();
        //ej8();
        //ejercicioExcepciones ejer = new ejercicioExcepciones();
        //ejer.pedirEntero();
        var ejer2 = new ejercicioPalabras();
        ejer2.ejercicio();
    }

    public static void ej1() {
        var input = List.of(1, 2, 3, 4, 5);
        Function<Integer, Integer> cuadrado = x -> x * x;
        var result = input.stream().map(cuadrado).collect(Collectors.toList());
        System.out.println(result.toString());
    }

    public static void ej2(){
        var input = List.of(1, -4, 12, 0, -3, 29, -150);
        var result = input.stream().filter(x -> x > 0).reduce(0, (acumulador, x) -> acumulador + x);
        System.out.println(result);
    }

    public static void ej3(){
        var input = List.of(12, 46, 32, 64);
        var divisor = input.size();
        double resultMedia = input.stream().reduce(0, (suma, x) -> suma + x);
        resultMedia = resultMedia / divisor;
        System.out.println("Mean: " + resultMedia);

        var ordenado = input.stream().sorted().collect(Collectors.toList());
        var resultMedian = ordenado.get(input.size() / 2 - 1); //Dudoso este calculo
        System.out.println("Median: " + resultMedian);
    }

    public static void ej4(){
        var input = "George Raymond Richard Martin";
        Stream.of(input.split(" ")).map(x -> x.charAt(0)).forEach(System.out::print);
    }

    public static void ej5() {
        var input = List.of(13, 56, 45, 67, 65);
        var ordenado = input.stream().sorted().collect(Collectors.toList());
        int minimo = ordenado.get(0);
        int maximo = ordenado.get(ordenado.size() - 1);
        System.out.println(minimo + ", " + maximo + ", " + (maximo - minimo));

        //Otra variante??
        var resultado = new ArrayList<Integer>();
        resultado.add(input.stream().min(Integer::compare).get());
        resultado.add(input.stream().max(Integer::compare).get());
        System.out.print(resultado);
    }

    public static void ej6(){
        var input = "Every developer likes to mix kubernetes and javascript";
        //Creo que se puede usar compose aca.
        Function<String, String> palabra = s -> ("" + s.charAt(0) + (s.length()- 2) + s.charAt(s.length() - 1) + " ");
        Function<String, String> largo = s -> s.length() > 4 ? palabra.apply(s) : s + " ";
        Stream.of(input.split(" "))
                .map(largo)
                .forEach(System.out::print);
    }

    public static void ej7(){
        //Funciona pero creo que ya excede al parcial esto, estuve mucho tiempo.
        BiFunction<BiFunction, Integer, Integer> recursion = (f, x) -> x <= 1 ? 1 : x * (int)f.apply(f, (x - 1)) ;
        Function<Integer, Integer> funcion = x -> recursion.apply(recursion, x);
        var input = 6;
        var numeros = new ArrayList<Integer>();
        for (int i = 0; i <= input; i++){
            numeros.add(i);
        }
        var resultado = numeros.stream().map(funcion).max(Integer::compare).get();
        System.out.println(resultado);

        //Metodo 2 muchisimo mas facil dios me quiero pegar un bword.
        var numeros2 = List.of(1, 2, 3, 4, 5, 6);
        var resultado2 = numeros2.stream().reduce(1, (suma, actual) -> suma * actual);
        System.out.println(resultado2);
    }

    public static void ej8(){
        var input = List.of('a', 'b', 'c','c','d','f','d','f','g');
        var valores = new HashSet<Character>(input);

        //valores.stream().reduce(0, (acumulador, actual) -> )
    }
}